package controllers;

import models.Chat;
import models.People;
import play.data.Form;
import play.data.FormFactory;
import play.i18n.MessagesApi;
import play.mvc.*;
import services.ChatService;
import services.UserService;
import views.html.Chatroom.Chatroom;

import javax.inject.Inject;
import java.util.List;

public class ChatroomController extends Controller {

    private final FormFactory formFactory;
    private final MessagesApi messagesApi;
    private final ChatService chatService;
    private final UserService userService;

    @Inject
    public ChatroomController(FormFactory formFactory, MessagesApi messagesApi, ChatService chatService, UserService userService) {
        this.formFactory = formFactory;
        this.messagesApi = messagesApi;
        this.chatService = chatService;
        this.userService = userService;
    }

    public Result index(Http.Request request) {
        return request.session().get("username").map(username -> {
            List<Chat> messages = chatService.getAllMessages();
            return ok(Chatroom.render(username, messages));
        }).orElseGet(() ->
                unauthorized("You must be logged in to access this page.")
        );
    }

    public Result send(Http.Request request) {
        Form<Chat> chatForm = formFactory.form(Chat.class).bindFromRequest(request);
        if (chatForm.hasErrors()) {
            return badRequest("Form errors");
        }
        String username = chatForm.rawData().get("username");
        People user = userService.getUserByUsername(username);
        if (user == null) {
            return badRequest("User not found");
        }
        Chat chat = new Chat();
        chat.setUser(user);
        chat.setMessage(chatForm.rawData().get("message"));
        chatService.saveMessage(chat);
        return redirect(routes.ChatroomController.index()).addingToSession(request, "username", username);
    }

    public Result update(Http.Request request) {
        Form<Chat> chatForm = formFactory.form(Chat.class).bindFromRequest(request);
        if (chatForm.hasErrors()) {
            return badRequest("Form errors");
        }
        String id = chatForm.rawData().get("id");
        String username = chatForm.rawData().get("username");
        People user = userService.getUserByUsername(username);
        Chat chat = chatService.getMessageById(Long.valueOf(id));
        if (chat != null && chat.getUser().getUsername().equals(username)) {
            chat.setMessage(chatForm.rawData().get("message"));
            chatService.updateMessage(chat);
            return redirect(routes.ChatroomController.index()).addingToSession(request, "username", username);
        } else {
            return unauthorized("You can only update your own messages.");
        }
    }

    public Result destroy(Http.Request request) {
        Form<Chat> chatForm = formFactory.form(Chat.class).bindFromRequest(request);
        if (chatForm.hasErrors()) {
            return badRequest("Form errors");
        }
        String id = chatForm.rawData().get("id");
        return request.session().get("username").map(username -> {
            Chat chat = chatService.getMessageById(Long.valueOf(id));
            if (chat != null && chat.getUser().getUsername().equals(username)) {
                chatService.deleteMessage(chat);
                return redirect(routes.ChatroomController.index()).addingToSession(request, "username", username);
            } else {
                return unauthorized("You can only delete your own messages.");
            }
        }).orElseGet(() ->
                unauthorized("You must be logged in to access this page.")
        );
    }

    public Result userMessages(Http.Request request) {
        return request.session().get("username").map(username -> {
            People user = userService.getUserByUsername(username);
            if (user != null) {
                List<Chat> userMessages = chatService.getMessagesByUser(user);
                return ok(views.html.Chatroom.UserMessages.render(username, userMessages));
            } else {
                return unauthorized("Invalid user.");
            }
        }).orElseGet(() -> unauthorized("You must be logged in to access this page."));
    }
}
package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import models.Chat;
import models.People;
import play.mvc.*;
import services.ChatService;
import services.UserService;

import javax.inject.Inject;
import java.util.List;

public class ChatroomController extends Controller {

    private final ChatService chatService;
    private final UserService userService;

    @Inject
    public ChatroomController(ChatService chatService, UserService userService) {
        this.chatService = chatService;
        this.userService = userService;
    }

    public Result index(Http.Request request) {
        List<Chat> messages = chatService.getAllMessages();
        JsonNode jsonNode = Json.toJson(messages);
        return ok(jsonNode).as("application/json");
    }

    public Result send(Http.Request request) {
        People user = userService.getUserByUsername(request.body().asJson().get("username").asText());
        Chat chat = new Chat(); chat.setUser(user); chat.setMessage(request.body().asJson().get("message").asText());
        chatService.saveMessage(chat);
        return ok(Json.toJson(chat)).as("application/json");
    }

    public Result update(Http.Request request) {
        String id = request.body().asJson().get("id").asText();
        String message = request.body().asJson().get("message").asText();
        Chat chat = chatService.getMessageById(Long.valueOf(id));
        chat.setMessage(message);
        chatService.updateMessage(chat);
        return ok(Json.toJson(chat)).as("application/json");
    }

    public Result destroy(Http.Request request) {
        String id = request.body().asJson().get("id").asText();
        Chat chat = chatService.getMessageById(Long.valueOf(id));
        chatService.deleteMessage(chat);
        return ok();
    }

    public Result userMessages(Http.Request request) {
        String username = request.body().asJson().get("username").asText();
        People user = userService.getUserByUsername(username);
        List<Chat> userMessages = chatService.getMessagesByUser(user);
        JsonNode jsonNode = Json.toJson(userMessages);
        return ok(jsonNode).as("application/json");
    }
}
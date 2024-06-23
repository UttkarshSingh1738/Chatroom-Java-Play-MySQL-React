package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import models.People;
import play.data.Form;
import play.data.FormFactory;
import play.i18n.MessagesApi;
import play.mvc.*;
import services.UserService;
import views.html.Chatroom.Login;
import views.html.Chatroom.Register;

import javax.inject.Inject;
import java.util.List;

class AppSummary {
    private String content;

    AppSummary(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

public class HomeController extends Controller {

    private final MessagesApi messagesApi;
    private final FormFactory formFactory;
    private final UserService userService;

    @Inject
    public HomeController(FormFactory formFactory, MessagesApi messagesApi, UserService userService) {
        this.formFactory = formFactory;
        this.messagesApi = messagesApi;
        this.userService = userService;
    }

    public Result appSummary() {
        JsonNode jsonNode = Json.toJson(new AppSummary("Java Play React Seed!"));
        return ok(jsonNode).as("application/json");
    }

    public Result index(Http.Request request) {
        List<People> users = userService.getAllUsers();
        Form<People> userForm = formFactory.form(People.class).withDirectFieldAccess(true);
        return ok(Login.render(userForm, users, request, messagesApi.preferred(request)));
    }

    public Result register(Http.Request request) {
        Form<People> userForm = formFactory.form(People.class).withDirectFieldAccess(true);
        return ok(Register.render(userForm, request, messagesApi.preferred(request)));
    }

    public Result save(Http.Request request) {
        Form<People> saveForm = formFactory.form(People.class).bindFromRequest(request).withDirectFieldAccess(true);
        if (saveForm.hasErrors()) {
            return badRequest(Register.render(saveForm, request, messagesApi.preferred(request)));
        }
        People user = saveForm.get();
        userService.saveUser(user);
        return redirect(routes.HomeController.index());
    }

    public Result authenticate(Http.Request request) {
        Form<People> loginForm = formFactory.form(People.class).bindFromRequest(request).withDirectFieldAccess(true);
        String username = loginForm.rawData().get("username");
        String password = loginForm.rawData().get("password");

        People user = userService.authenticateUser(username, password);
        if (user != null) {
            return redirect(routes.ChatroomController.index())
                    .addingToSession(request, "username", username);
        } else {
            return unauthorized("Invalid credentials")
                    .flashing("error", "Invalid username or password");
        }
    }

    public Result logout() {
        return redirect(routes.HomeController.index()).withNewSession();
    }
}
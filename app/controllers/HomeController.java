package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import models.People;
import play.mvc.*;
import services.UserService;

import javax.inject.Inject;

public class HomeController extends Controller {

    private final UserService userService;

    @Inject
    public HomeController(UserService userService) {
        this.userService = userService;
    }

    public Result index() {
        return ok();
    }

    public Result register() {
        return ok();
    }

    public Result save(Http.Request request) {
        People user = Json.fromJson(request.body().asJson(), People.class);
        userService.saveUser(user);
        return ok();
    }

    public Result authenticate(Http.Request request) {
        People user = userService.authenticateUser(
                request.body().asJson().get("username").asText(), request.body().asJson().get("password").asText());
        ObjectNode result = Json.newObject();
        if (user != null) { result.put("status", "success");
        } else { result.put("status", "fail"); }
        return ok(result).as("application/json");
    }

    public Result logout(Http.Request request) {
        return ok();
    }
}
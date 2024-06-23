package services;

import models.Chat;
import models.People;

import javax.inject.Inject;
import java.util.List;

public class ChatService {

    @Inject
    public ChatService() {
    }

    public List<Chat> getAllMessages() {
        return Chat.find.query().fetch("user").findList();
    }

    public List<Chat> getMessagesByUser(People user) {
        return Chat.find.query().fetch("user").where().eq("user", user).findList();
    }

    public Chat getMessageById(Long id) {
        return Chat.find.byId(id);
    }

    public void saveMessage(Chat chat) {
        chat.save();
    }

    public void updateMessage(Chat chat) {
        chat.update();
    }

    public void deleteMessage(Chat chat) {
        chat.delete();
    }
}
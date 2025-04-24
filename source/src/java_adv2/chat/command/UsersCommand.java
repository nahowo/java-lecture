package java_adv2.chat.command;

import java_adv2.chat.server.Session;
import java_adv2.chat.server.SessionManager;

import java.io.IOException;

public class UsersCommand implements Command {
    private final SessionManager sessionManager;

    public UsersCommand(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public void execute(String[] args, Session session) throws IOException {
        sessionManager.send("현재 접속자: " + sessionManager.allUsers(), session);
    }

}

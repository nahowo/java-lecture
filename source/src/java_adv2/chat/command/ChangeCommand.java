package java_adv2.chat.command;

import java_adv2.chat.server.Session;
import java_adv2.chat.server.SessionManager;

import java.io.IOException;

public class ChangeCommand implements Command {
    private final SessionManager sessionManager;

    public ChangeCommand(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public void execute(String[] args, Session session) throws IOException {
        String newName = args[1];
        String name = session.getName();
        sessionManager.sendAll(name + "님이 이름을 " + newName + "(으)로 변경했습니다. ");
        session.setName(newName);
    }

}

package java_adv2.chat.command;

import java_adv2.chat.server.Session;
import java_adv2.chat.server.SessionManager;

import java.io.IOException;

public class ExitCommand implements Command {
    private final SessionManager sessionManager;

    public ExitCommand(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public void execute(String[] args, Session session) throws IOException {
        String name = session.getName();
        sessionManager.sendAll(name + "님이 퇴장했습니다. ");
        sessionManager.remove(session);
        session.close();
    }
}

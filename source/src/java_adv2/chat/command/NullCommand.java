package java_adv2.chat.command;

import java_adv2.chat.server.Session;
import java_adv2.chat.server.SessionManager;

import java.io.IOException;
import java.util.Arrays;

public class NullCommand implements Command{
    private final SessionManager sessionManager;

    public NullCommand(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public void execute(String[] args, Session session) throws IOException {
        sessionManager.send(Arrays.toString(args) + "는(은) 처리할 수 없는 명령어입니다. ", session);
    }
}

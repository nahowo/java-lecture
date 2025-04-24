package java_adv2.chat.server;

import java_adv2.chat.command.*;

import java.io.IOException;
import java.util.*;

public class SessionManager {
    private final List<Session> sessions = new ArrayList<>();
    public final Map<String, Command> commands = new HashMap<>();
    private final NullCommand nullCommand = new NullCommand(this);

    public SessionManager() {
        commands.put("/join", new JoinCommand(this));
        commands.put("/message", new MessageCommand(this));
        commands.put("/change", new ChangeCommand(this));
        commands.put("/users", new UsersCommand(this));
        commands.put("/exit", new ExitCommand(this));
    }

    public void execute(String received, Session session) throws IOException {
        String[] args = parseMessage(received);
        Command command = commands.getOrDefault(args[0], nullCommand);
        command.execute(args, session);
    }

    private String[] parseMessage(String message) {
        String[] args = message.split("\\|");
        return args;
    }

    public synchronized void add(Session session) {
        sessions.add(session);
    }

    public synchronized void remove(Session session) {
        sessions.remove(session);
    }

    public synchronized void sendAll(String message) throws IOException {
        for (Session session : sessions) {
            session.output.writeUTF(message);
        }
    }

    public synchronized void send(String message, Session session) throws IOException {
        session.output.writeUTF(message);
    }

    public synchronized String allUsers() {
        String[] userNames = new String[sessions.size()];
        int i = 0;
        for (Session session : sessions) {
            userNames[i] = session.getName();
            i ++;
        }
        return Arrays.toString(userNames);
    }

    public synchronized void closeAll() {
        for (Session session : sessions) {
            session.close();
        }
        sessions.clear();
    }

}

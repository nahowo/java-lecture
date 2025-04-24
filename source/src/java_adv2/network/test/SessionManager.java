package java_adv2.network.test;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SessionManager {
    private final List<Session> sessions;

    public SessionManager() {
        this.sessions = new ArrayList<>();
    }

    public synchronized void add(Session session) throws IOException {
        sessions.add(session);
    }

    public synchronized void remove(Session session) {
        sessions.remove(session);
    }

    public synchronized void closeAll() {
        for (Session session : sessions) {
            session.close();
        }
        sessions.clear();
    }

    public synchronized void printAll() throws IOException {

    }

    public synchronized void send(String message) throws IOException {
        for (Session session : sessions) {
            session.send(message);
        }
    }
}

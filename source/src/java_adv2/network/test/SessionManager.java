package java_adv2.network.test;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SessionManager {
    private List<Session> sessions = new ArrayList<>();

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

    public synchronized void printAll(Session session) throws IOException {

        for (Session s : sessions) {
            session.send(s.getName());
        }
    }

    public synchronized void send(String message) throws IOException {
        for (Session session : sessions) {
            session.send(message);
        }
    }
}

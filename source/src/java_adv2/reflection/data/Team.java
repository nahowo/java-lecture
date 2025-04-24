package java_adv2.reflection.data;

public class Team {
    private String id;
    private String nema;

    @Override
    public String toString() {
        return "Team{" +
                "id='" + id + '\'' +
                ", nema='" + nema + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNema() {
        return nema;
    }

    public void setNema(String nema) {
        this.nema = nema;
    }

    public Team(String id, String nema) {
        this.id = id;
        this.nema = nema;
    }

    public Team() {
    }
}

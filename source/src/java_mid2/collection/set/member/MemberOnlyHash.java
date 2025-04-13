package java_mid2.collection.set.member;

import java.util.Objects;

public class MemberOnlyHash {
    private String id;

    public MemberOnlyHash(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); // 같은 id이면 같은 hashCode를 반환하도록
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + "";
    }
}

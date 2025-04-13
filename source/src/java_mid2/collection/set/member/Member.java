package java_mid2.collection.set.member;

import java.util.Objects;

public class Member {
    private String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Member member = (Member) object;
        return Objects.equals(id, member.id);
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

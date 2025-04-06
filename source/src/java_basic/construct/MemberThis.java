package java_basic.construct;

public class MemberThis {
    String name;

    void initMemberThis(String np) {
        name = np;
    }

    void initMemberThis2(String name) {
        this.name = name;
    }
}

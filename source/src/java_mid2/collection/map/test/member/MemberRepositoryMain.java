package java_mid2.collection.map.test.member;

public class MemberRepositoryMain {
    public static void main(String[] args) {
        Member m1 = new Member("id1", "회원1");
        Member m2 = new Member("id2", "회원2");
        Member m3 = new Member("id3", "회원3");

        MemberRepository repository = new MemberRepository();
        repository.save(m1);
        repository.save(m2);
        repository.save(m3);

        Member findMember1 = repository.findById("id1");
        System.out.println("findMember1 = " + findMember1);
        Member findMember3 = repository.findByName("회원3");
        System.out.println("findMember3 = " + findMember3);

        repository.remove("id1");
        Member removedMember1 = repository.findById("id1");
        System.out.println("removedMember1 = " + removedMember1);
    }
}

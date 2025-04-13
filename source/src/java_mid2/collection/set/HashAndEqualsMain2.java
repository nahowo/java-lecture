package java_mid2.collection.set;

import java_mid2.collection.set.member.MemberOnlyHash;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2();
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");

        System.out.println("m1.hashCode() = " + m1.hashCode()); // id 기준이므로 같음
        System.out.println("m2.hashCode() = " + m2.hashCode());

        set.add(m1);
        set.add(m2);

        System.out.println(set); // "A"는 중복이지만 참조값 기준 비교이므로 다르다고 판단

        System.out.println("set.contains('A')) = " + set.contains(new MemberOnlyHash("A"))); // 인스턴스 참조값이 다르면 equals() => false
    }
}

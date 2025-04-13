package java_mid2.collection.set;

import java_mid2.collection.set.member.MemberNoHashNoEq;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2();
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");

        System.out.println("m1.hashCode() = " + m1.hashCode()); // 참조값 기준이므로 다름
        System.out.println("m2.hashCode() = " + m2.hashCode());

        set.add(m1);
        set.add(m2);

        System.out.println(set); // "A"가 중복으로 들어감

        System.out.println("set.contains('A')) = " + set.contains(new MemberNoHashNoEq("A"))); // 인스턴스 참조값이 다르면 equals() => false
    }
}

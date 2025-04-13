package java_mid2.collection.set;

import java_mid2.collection.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
//        Object o1 = new Object();
//        Object o2 = new Object();
//        System.out.println("o1.hashCode() = " + o1.hashCode()); // Object의 hashCode() 오버라이딩 없이 사용 -> 인스턴스가 다르면 hashcode 값도 다름
//        System.out.println("o2.hashCode() = " + o2.hashCode());
        Member m1 = new Member("m1");
        Member m2 = new Member("m1");

        System.out.println("m1.hashCode() = " + m1.hashCode()); // hashCode() 오버라이딩 -> id가 같기 때문에 hashcode도 같음 !!!
        System.out.println("m2.hashCode() = " + m2.hashCode());
    }
}

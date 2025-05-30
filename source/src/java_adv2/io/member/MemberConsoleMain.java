package java_adv2.io.member;

import java_adv2.io.member.impl.DataMemberRepository;
import java_adv2.io.member.impl.FileMemberRepository;
import java_adv2.io.member.impl.MemoryMemberRepository;
import java_adv2.io.member.impl.ObjectMemberRepository;

import java.util.List;
import java.util.Scanner;

public class MemberConsoleMain {
    private static final MemberRepository repository = new ObjectMemberRepository();

    public static void main(String[] args) {
        System.out.println(repository.getClass().getSimpleName());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. 회원 등록 | 2. 회원 목록 조회 | 3. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    registerMember(scanner);
                    break;
                case 2:
                    displayMembers();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다. ");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. ");
            }
        }
    }

    private static void registerMember(Scanner scanner) {
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("이름: ");
        String name = scanner.nextLine();
        System.out.print("나이: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        Member member = new Member(id, name, age);
        repository.add(member);
        System.out.println("회원이 등록되었습니다. ");
    }

    private static void displayMembers() {
        List<Member> members = repository.findAll();
        for (Member member : members) {
            System.out.printf("[ID: %s, Name: %s, Age: %d]\n", member.getId(), member.getName(), member.getAge());
        }

        System.out.println("회원 정보를 조회했습니다. ");
    }
}

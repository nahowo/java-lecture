package java_adv2.webservice;

import java_adv2.io.member.Member;
import java_adv2.io.member.MemberRepository;
import java_adv2.was.httpserver.HttpRequest;
import java_adv2.was.httpserver.HttpResponse;
import java_adv2.was.servlet.annotation.Mapping;

import java.util.List;

import static java_adv1.util.MyLogger.log;

public class MemberController {
    private final MemberRepository memberRepository;

    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Mapping("/")
    public void home(HttpResponse response) {
        String str = "<html><body>" +
                "<h1>회원 관리</h1>" +
                "<ul>" +
                "<li><a href='/members'>회원 정보 조회</a></li>" +
                "<li><a href='/add-member-form'>회원 추가</a></li>" +
                "</ul>";
        response.writeBody(str);
    }

    @Mapping("/members")
    public void getUsers(HttpResponse response) {
        List<Member> members = findAllMembers();
        response.writeBody("<h1>회원 목록을 조회합니다. </h1>");
        response.writeBody("<ul>");
        for (Member member : members) {
            response.writeBody("<li>id: " + member.getId() + "</li>");
            response.writeBody("<li>name: " + member.getName() + "</li>");
            response.writeBody("<li>age: " + member.getAge() + "</li><br>");
        }
        response.writeBody("</ul>");
        response.writeBody("<a href='/'>메인 화면으로 돌아가기</a>");
    }

    private List<Member> findAllMembers() {
        return memberRepository.findAll();
    }

    @Mapping("/add-member-form")
    public void addMemberForm(HttpResponse response) {
        String str = "<html><body>" +
                "<h1>회원 추가</h1>" +
                "<form method = 'POST' action='/member/join'>" +
                "id: <input type='text' name='id'><br>" +
                "name: <input type='text' name='name'><br>" +
                "age: <input type='text' name='age'><br>" +
                "<input type='submit' value='회원 등록'>" +
                "</form>" +
                "<a href='/'>메인 화면으로 돌아가기</a>" +
                "</html></body>";
        response.writeBody(str);
    }

    @Mapping("/member/join")
    public void createMember(HttpRequest request, HttpResponse response) {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));

        Member savedMember = saveMember(id, name, age); // 서비스
        response.writeBody("<h1>회원 정보를 등록했습니다. </h1>");
        response.writeBody("<ul>");
        response.writeBody("<li>id: " + savedMember.getId() + "</li>");
        response.writeBody("<li>name: " + savedMember.getName() + "</li>");
        response.writeBody("<li>age: " + savedMember.getAge() + "</li>");
        response.writeBody("</ul>");
        response.writeBody("<a href='/'>메인 화면으로 돌아가기</a>");
    }

    private Member saveMember(String id, String name, int age) {
        try {
            Member member = new Member(id, name, age);
            memberRepository.add(member);
            return member;
        } catch (Exception e) {
            log("회원 정보를 저장하는 데 실패했습니다. 회원 정보: {" + id + ", " + name + ", " + age + "}");
        }
        return null;
    }
}

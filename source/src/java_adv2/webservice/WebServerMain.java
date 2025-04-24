package java_adv2.webservice;

import java_adv2.io.member.MemberRepository;
import java_adv2.io.member.impl.ObjectMemberRepository;
import java_adv2.was.httpserver.HttpServer;
import java_adv2.was.httpserver.ServletManager;
import java_adv2.was.httpserver.servlet.DiscardServlet;
import java_adv2.was.servlet.annotation.AnnotationServletV3;

import java.io.IOException;
import java.util.List;

public class WebServerMain {
    public static final int PORT = 12345;
    private static final MemberRepository memberRepository = new ObjectMemberRepository();

    public static void main(String[] args) throws IOException {

        List<Object> controllers = List.of(new MemberController(memberRepository));
        AnnotationServletV3 annotationServlet = new AnnotationServletV3(controllers);

        ServletManager servletManager = new ServletManager();
        servletManager.setDefaultServlet(annotationServlet);
        servletManager.add("/favicon.ico", new DiscardServlet());

        HttpServer server = new HttpServer(PORT, servletManager);
        server.start();
    }
}

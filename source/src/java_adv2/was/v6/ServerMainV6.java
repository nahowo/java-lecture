package java_adv2.was.v6;

import java_adv2.was.httpserver.HttpServer;
import java_adv2.was.httpserver.ServletManager;
import java_adv2.was.httpserver.servlet.DiscardServlet;
import java_adv2.was.httpserver.servlet.reflection.ReflectionServlet;
import java_adv2.was.v5.servlet.HomeServlet;
import java_adv2.was.v5.servlet.SearchServlet;
import java_adv2.was.v5.servlet.Site1Servlet;
import java_adv2.was.v5.servlet.Site2Servlet;

import java.io.IOException;
import java.util.List;

public class ServerMainV6 {
    public static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        List<Object> controllers = List.of(new SiteControllerV6(), new SearchControllerV6());
        ReflectionServlet reflectionServlet = new ReflectionServlet(controllers);

        ServletManager servletManager = new ServletManager();
        servletManager.setDefaultServlet(reflectionServlet);
        servletManager.add("/", new HomeServlet());
        servletManager.add("/favicon.ico", new DiscardServlet());

        HttpServer server = new HttpServer(PORT, servletManager);
        server.start();
    }
}

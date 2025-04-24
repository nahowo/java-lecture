package java_adv2.was.v6;

import java_adv2.was.httpserver.HttpRequest;
import java_adv2.was.httpserver.HttpResponse;

import java.util.Map;

public class SearchControllerV6 {
    public void search(HttpRequest request, HttpResponse response) {
        Map<String, String> queries = request.getAllParameters();
        response.writeBody("<h1>search</h1>");
        response.writeBody("<ul>");
        for (String query : queries.keySet()) {
            response.writeBody("<li>" + query + ": " + queries.get(query) + "</li>");
        }
        response.writeBody("</ul>");
    }
}

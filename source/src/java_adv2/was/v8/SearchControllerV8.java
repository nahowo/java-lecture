package java_adv2.was.v8;

import java_adv2.was.httpserver.HttpRequest;
import java_adv2.was.httpserver.HttpResponse;
import java_adv2.was.servlet.annotation.Mapping;

import java.util.Map;

public class SearchControllerV8 {
    @Mapping("/search")
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

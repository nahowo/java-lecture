package java_mid2.collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    Deque<String> stack = new ArrayDeque<>();
    public void visitPage(String page) {
        System.out.println(page + " 방문");
        stack.push(page);
    }

    public void goBack() {
        if (!stack.isEmpty()) {
            System.out.println("현재 페이지: " + stack.pop());
        }
        if (!stack.isEmpty()) {
            System.out.println(stack.pop() + " 로 돌아가기");
        }
    }
}

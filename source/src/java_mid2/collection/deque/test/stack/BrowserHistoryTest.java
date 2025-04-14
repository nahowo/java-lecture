package java_mid2.collection.deque.test.stack;

public class BrowserHistoryTest {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();
        browser.visitPage("https://youtube.com");
        browser.visitPage("https://inflearn.com");

        browser.goBack();
        browser.visitPage("https://google.com");
        browser.goBack();
    }
}

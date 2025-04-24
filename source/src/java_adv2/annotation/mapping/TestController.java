package java_adv2.annotation.mapping;

public class TestController {
    @SimpleMapping(value = "/")
    public void home() {
        System.out.println("TestController.come()");
    }

    @SimpleMapping(value = "/site1")
    public void page1() {
        System.out.println("TestController.page1()");
    }
}

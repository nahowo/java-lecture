package java_basic.extends1.access.parent;

public class Parent {
    public int pubV;
    protected int proV;
    int defV;
    private int priV;

    public void pubM() {
        System.out.println("Parent.pubM()");
    }

    protected void proM() {
        System.out.println("Parent.proM()");
    }

    public void defM() {
        System.out.println("Parent.defM()");
    }

    private void priM() {
        System.out.println("Parent.priM()");
    }

    public void printParent() {
        System.out.println("Parent");
        pubM();
        proM();
        defM();
        priM();
    }
}

package java_adv3.lambda.lambda6;

public class OuterMain {
    private String message = "외부클래스";

    public void execute() {
        Runnable annonymous = new Runnable() {
            private String message = "익명클래스";

            @Override
            public void run() {
                System.out.println("익명: " + this);
                System.out.println("익명.class: " + this.getClass());
                System.out.println("익명.message: " + this.message);
            }
        };
        annonymous.run();

        Runnable lambda = () -> {
            System.out.println("lambda.this: " + this);
            System.out.println("lambda.this.class: " + this.getClass());
            System.out.println("lambda.this.message: " + this.message);
        };

        lambda.run();
    }

    public static void main(String[] args) {
        OuterMain outer = new OuterMain();
        outer.execute();
    }
}

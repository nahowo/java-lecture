package java_adv3.lambda.lambda1;

public class SamMain {
    public static void main(String[] args) {
        SamInterface samInterface = () -> {
            System.out.println("sam");
        };
        samInterface.run();

//        NotSamInterface notSamInterface = () -> {
//            System.out.println("not sam");
//        }; // 컴파일 오류

    }
}

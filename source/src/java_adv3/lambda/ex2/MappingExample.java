package java_adv3.lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class MappingExample {
    public static void main(String[] args) {
        List<String> list = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트: " + list);

        MyFunction uppper = (s) -> s.toUpperCase();
        MyFunction addDeco = (s) -> "***" + s +"***";

        System.out.println("대문자 변환 결과: " + map(list, uppper));
        System.out.println("특수문자 데코 결과: " + map(list, addDeco));
    }

    static List<String> map(List<String> list, MyFunction myFunction) {
        List<String> ret = new ArrayList<>();
        for (String s : list) {
            ret.add(myFunction.apply(s));
        }
        return ret;
    }

    @FunctionalInterface
    static interface MyFunction {
        String apply(String s);
    }

}

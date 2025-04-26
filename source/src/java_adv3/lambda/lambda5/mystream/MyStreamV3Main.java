package java_adv3.lambda.lambda5.mystream;

import java.util.List;

public class MyStreamV3Main {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student("tomato", 68), new Student("pie", 90), new Student("apple", 82), new Student("hi", 78));
        List<String> ret = MyStreamV3.of(students)
                .filter(n -> n.getScore() >= 80)
                .map(n -> n.getName())
                .toList();

        System.out.println(ret);

        List<String> ret1 = MyStreamV3.of(students)
                .filter(n -> n.getScore() >= 80)
                .filter(n -> n.getName().length() > 3)
                .map(n -> n.getName().toUpperCase())
                .toList();
        System.out.println(ret1);
    }
}

package java_adv3.lambda.lambda5.mystream;

import java.util.List;

public class MyStreamLoopMain {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student("tomato", 68), new Student("pie", 90), new Student("apple", 82), new Student("hi", 78));
        MyStreamV3.of(students)
                .filter(n -> n.getScore() >= 80)
                .map(n -> n.getName())
                .forEach(name -> System.out.println("name: " + name));


        MyStreamV3.of(students)
                .filter(n -> n.getScore() >= 80)
                .filter(n -> n.getName().length() > 3)
                .map(n -> n.getName().toUpperCase())
                .forEach(name -> System.out.println("name: " + name));
    }
}

package java_adv3.lambda.lambda5.mystream;

import java_adv3.lambda.lambda5.filter.GenericFilter;
import java_adv3.lambda.lambda5.map.GenericMap;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex1_Student {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student("s1", 68), new Student("s2", 90), new Student("s3", 82), new Student("s4", 78));
        System.out.println(direct(students));
        System.out.println(lambda(students));
    }

    public static List<String> direct(List<Student> students) {
        List<String> ret = new ArrayList<>();
        for (Student student : students) {
            if (student.getScore() >= 80) {
                ret.add(student.getName());
            }
        }
        return ret;
    }

    public static List<String> lambda(List<Student> students) {
        List<Student> highScores = GenericFilter.filter(students, a1 -> a1.getScore() >= 80);
        return GenericMap.map(highScores, a -> a.getName());
    }
}

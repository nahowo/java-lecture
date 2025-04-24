package java_adv2.reflection;

import java_adv2.reflection.data.User;

import java.lang.reflect.Field;
import java.util.Scanner;

public class FieldV2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);

        User user = new User("id1", "userA", 20);
        System.out.println("이름: " + user.getName());

        Class<? extends User> userClass = user.getClass();
        Field nameField = userClass.getDeclaredField("name");

        System.out.print("새 이름을 입력하세요: ");
        String newName = scanner.nextLine();

        nameField.setAccessible(true); // private에도 접근 가능하도록 허용
        nameField.set(user, newName);
        System.out.println("변경된 이름: " + user.getName());

    }
}

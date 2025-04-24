package java_adv2.annotation.validator;

import static java_adv1.util.MyLogger.log;

public class ValidatorV1Main {
    public static void main(String[] args) {
        User user = new User("user1", 0);
        Team team = new Team("", 0);

        try {
            log("==user 검증==");
            validateUser(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void validateUser(User user) {
        if (user.getName() != null | user.getName().isEmpty()) {
            throw new RuntimeException("이름이 비었습니다. ");
        }
    }
}

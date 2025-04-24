package java_adv2.annotation.validator;

import static java_adv1.util.MyLogger.log;

public class ValidatorV2Main {
    public static void main(String[] args) {
        User user = new User("user1", 0);
        Team team = new Team("", 0);

        try {
            log("==user 검증==");
            Validator.validator(user);
        } catch (Exception e) {
            log(e);
        }

        try {
            log("==team 검증==");
            Validator.validator(team);
        } catch (Exception e) {
            log(e);
        }
    }
}

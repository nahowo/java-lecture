package java_adv2.reflection;

import java_adv2.reflection.data.Team;
import java_adv2.reflection.data.User;

public class FieldV3 {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User("id1", null, null);
        Team team = new Team("team1", null);

        System.out.println("==before==");
        System.out.println("user = " + user);
        System.out.println("team = " + team);

        FieldUtil.nullFieldToDefault(user);
        FieldUtil.nullFieldToDefault(team);
        System.out.println("==after==");
        System.out.println("user = " + user);
        System.out.println("team = " + team);
    }
}

package java_mid1.lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

//    @Override
//    public boolean equals(Object object) {
//        UserV2 user = (UserV2) object;
//
//        boolean result = id.equals(user.id);
//        return result;
//    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UserV2 userV2 = (UserV2) object;
        return Objects.equals(id, userV2.id);
    }
}

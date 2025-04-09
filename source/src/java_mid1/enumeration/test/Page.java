package java_mid1.enumeration.test;

public enum Page {
    MAIN("메인 화면"),
    EMAIL_CONTROL("이메일 관리 화면"),
    ADMIN_PAGE("관리자 화면");

    private final String description;

    Page(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

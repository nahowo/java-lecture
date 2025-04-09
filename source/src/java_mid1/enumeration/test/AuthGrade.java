package java_mid1.enumeration.test;

public enum AuthGrade {
    GUEST(1, "손님", new Page[]{Page.MAIN}),
    LOGIN(2, "로그인 회원", new Page[]{Page.MAIN, Page.EMAIL_CONTROL}),
    ADMIN(3, "관리자", new Page[]{Page.MAIN, Page.EMAIL_CONTROL, Page.ADMIN_PAGE});

    private final int level;
    private final String description;

    private final Page[] pages;

    AuthGrade(int level, String description, Page[] pages) {
        this.level = level;
        this.description = description;
        this.pages = pages;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    public String getPages() {
        String[] descriptions = new String[pages.length];
        for (int i = 0; i < pages.length; i ++) {
            descriptions[i] = " - " + pages[i].getDescription();
        }
        return String.join("\n", descriptions);
    }
}

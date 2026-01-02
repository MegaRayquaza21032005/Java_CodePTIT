package common;

import model.User;

public class AppContext {
    private static User user = null;

    public static User getUser() {
        return user;
    }

    public static void setUser(User user) {
        AppContext.user = user;
    }
}

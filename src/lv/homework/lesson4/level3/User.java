package lv.homework.lesson4.level3;

public class User {
    private String login = "Lietotajs";
    private String password = "Parole";
    private int loginAttemptsLeft = 3;
    private boolean blocked = false;

    String getLogin() {
        return login;
    }

    String getPassword() {
        return password;
    }

    int getLoginAttemptsLeft() {
        return loginAttemptsLeft;
    }

    boolean getBlocked() {
        return blocked;
    }

    private void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    void block() {
        setBlocked(true);
    }

    void decreaseLoginAttemptsLeft() {
        loginAttemptsLeft = loginAttemptsLeft - 1;
    }

}

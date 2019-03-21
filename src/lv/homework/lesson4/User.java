package lv.homework.lesson4;

public class User {
    private String login = "Lietotajs";
    private String password = "Parole";
    private int loginAttemptsLeft = 3;
    private boolean blocked = false;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLoginAttemptsLeft() {
        return loginAttemptsLeft;
    }

    public void setLoginAttemptsLeft(int loginAttemptsLeft) {
        this.loginAttemptsLeft = loginAttemptsLeft;

    }

    public boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public void resetLoginAttempts() {
        setLoginAttemptsLeft(38);
    }


    public void block() {
        setBlocked(true);
        System.out.println("Noblokeju");
    }

}

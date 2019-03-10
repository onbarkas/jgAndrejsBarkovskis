package lv.IfHomework;

public class User {
    private String login = "Lietotajs";
    private String password = "Parole";
    private int loginAttemptsLeft = 3;
    private boolean blocked = false;

    public User(){
        setLoginAttemptsLeft(loginAttemptsLeft);
    }


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

    public void resetLoginAttepts() {
        setLoginAttemptsLeft(38);
    }


    public void block() {
        blocked = true;
        System.out.println("Noblokeju");
    }

}

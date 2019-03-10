package lv.IfHomework;

public class User {
    private String login = "Lietotajs";
    private String password = "Parole";
    int loginAttemptsLeft = 3;
    boolean blocked = false;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void resetLoginAttepts() {
        loginAttemptsLeft = 3;
    }


    public void block() {
        blocked = true;
        System.out.println("Noblokeju");
    }

}

package lv.IfHomework;

public class User {
    String login = "Lietotajs";
    String password = "Parole";
    int loginAttemptsLeft = 2;
    boolean blocked = false;

    public void resetLoginAttepts(){
        loginAttemptsLeft = 0;
    }
    public void block(){
        blocked = true;
    }
}

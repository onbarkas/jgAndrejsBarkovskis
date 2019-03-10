package lv.IfHomework;

public class User {
    String login = "Lietotajs";
    String password = "Parole";
    int loginAttemptsLeft = 3;
    boolean blocked = false;

    public void resetLoginAttepts(){
        loginAttemptsLeft = 3;
    }
    public void block(){
        blocked = true;
        System.out.println("Noblokeju");
    }

}

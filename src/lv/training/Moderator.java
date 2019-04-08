package lv.training;

public class Moderator extends User{
    protected void blockPost(){
        System.out.println("Blocking...");
    }
}

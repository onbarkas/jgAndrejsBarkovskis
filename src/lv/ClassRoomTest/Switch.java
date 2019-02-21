package lv.ClassRoomTest;

public class Switch {
    public static void main(String[] args) {
        String drink = "no";

        switch (drink){
            case "go":
                System.out.println("go");
                break;
            case "no":
                System.out.println("not go");
                default:
                    System.out.println("haha");
        }
    }
}

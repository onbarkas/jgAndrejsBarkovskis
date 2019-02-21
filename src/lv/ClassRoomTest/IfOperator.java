package lv.ClassRoomTest;

public class IfOperator {
    public static void main(String[] args) {
        int x = 10;

        if ((x > 5) && (x < 15)){
            System.out.println("Within bounds");
        }

        if ((x < 5) || (x >= 10)){
            System.out.println(" x ");
        }

        if (x != 20){
            System.out.println("x is not 20");
        }

        if (((x < 5) && (x > 15)) || x == 10){
            System.out.println("x is 10");
        }
    }
}

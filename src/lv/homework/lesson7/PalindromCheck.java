package lv.homework.lesson7;


import java.util.Scanner;

public class PalindromCheck {
    public void isPalindrome() {
     //   int inputInt;
        Scanner scanner = new Scanner(System.in);
        int inputInt = scanner.nextInt();
        String[] array = new String[5];
        String[] arrayReversed = new String[5];
        array[0] = "racecar";
        array[1] = "level";
        array[2] = "level";
        array[3] = "summus";
        array[4] = "auto";


      //  do {
     //       System.out.println("Ievadiet rindas numuru no 0 lidz" + array.length + ", kuru gribat parbaudit");
    //    } while ( (inputInt < 0) || (inputInt > 5));


        for (int i = 0; i < array.length; i++){
            arrayReversed[i] = new StringBuilder(array[i]).reverse().toString();
        }

        if (array[1].equals(arrayReversed[1])) {
            System.out.println("sssssss");
        } else {
            System.out.println("aaaa");
        }
    }
}

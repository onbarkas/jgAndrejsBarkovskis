package lv.homework.lesson7;


import java.util.Arrays;
import java.util.Scanner;

public class PalindromCheck {
    public void isPalindrome() {
        int inputInt;
        Scanner scanner = new Scanner(System.in);

        String[] array = new String[5];
        String[] arrayReversed = new String[5];
        array[0] = "racecar";
        array[1] = "level";
        array[2] = "level";
        array[3] = "summus";
        array[4] = "auto";

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            arrayReversed[i] = new StringBuilder(array[i]).reverse().toString();
        }



        do {
            System.out.println("Ievadiet rindas numuru no 0 lidz " + array.length + ", kuru gribat parbaudit");
            inputInt = scanner.nextInt();

        } while ((inputInt < 0) || (inputInt > 4));

        System.out.println(array[inputInt]);
        System.out.println(arrayReversed[inputInt]);
        if (array[inputInt].equals(arrayReversed[inputInt])) {
            System.out.println("ir");
        } else {
            System.out.println("nav");
        }



    }
}

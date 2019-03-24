package lv.homework.lesson7;


import java.util.Scanner;

public class PalindromCheck {
    public boolean isPalindrome() {
        int inputInt;
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];
        String[] arrayReversed = new String[5];

        array[0] = "Racecar";
        array[1] = "level";
        array[2] = "Level";
        array[3] = "summus";
        array[4] = "auto";

        listOfArray(array);

        reverse(array, arrayReversed);

        inputInt = inputChecker(scanner, array);

        return (array[inputInt].equals(arrayReversed[inputInt]));
    }

    private void listOfArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". " + array[i]);
        }
    }

    private void reverse(String[] array, String[] arrayReversed) {
        for (int i = 0; i < array.length; i++) {
            arrayReversed[i] = new StringBuilder(array[i]).reverse().toString().toLowerCase();
            array[i] = new StringBuilder(arrayReversed[i]).reverse().toString().toLowerCase();
        }
    }

    private int inputChecker(Scanner scanner, String[] array) {
        int inputInt;
        do {
            System.out.println("Ievadiet rindas numuru no 1 lidz " + (array.length) + ", kuru gribat parbaudit");
            inputInt = scanner.nextInt() - 1;
        } while ((inputInt < 0) || (inputInt > 5));
        return inputInt;
    }
}

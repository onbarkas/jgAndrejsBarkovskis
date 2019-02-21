package lv.ClassRoomTest;

import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet burtu");

        String enteredString = scanner.next();
        char enteredChar = enteredString.charAt(0);

        System.out.println("Ievad'itais burts ir " + isVowel(enteredChar));
        System.out.println("Ievad'itais burts ir " + isVowelWithIf(enteredChar));
    }

    private static String isVowelWithIf(char enteredChar) {
        if ((enteredChar == 'a') || (enteredChar == 'A') || (enteredChar == 'e')
                || (enteredChar == 'E') || (enteredChar == 'i') || (enteredChar == 'I')
                || (enteredChar == 'o') || (enteredChar == 'O') || (enteredChar == 'u')
                || (enteredChar == 'U')) {
            return "patskanis";
        }
        else {
            return "lidzskanis";
        }
    }

    private static String isVowel(char enteredChar) {
        switch (enteredChar){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                return "patskanis";
                default:
                    return "lidzskanis";
        }
    }
}

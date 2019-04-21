package lv.homework.lesson6;

import java.util.Random;
import java.util.Scanner;

class Ugadaika {
    private int inputInt;
    private String inputString;
    private int randomNumber;
    private int rangeMax = 100;
    private Scanner scanner = new Scanner(System.in);
    private Random randomGenerator = new Random();

    void numberCheck() {
        userNumberInput();
        randomNumber();
        checkLoop();
    }

    private void userNumberInput() {
        do {
            System.out.println("Ievadiet numuru no 1 lidz 100");
            scannerInt();
        }
        while ((inputInt < 0) || (inputInt > 100)); //par daudz iekavu
    }

    private void checkLoop() {
        do {
            System.out.println("ievadiet, skaitlis ir lielaks, vienads vai mazaks");
            scannerString();

            //lietojam konstrukciju if-else if-else, jo var bū vai nu viens stāvoklis vai otrs
/*            if (inputString.equals("lielaks")) {
                randomNumber = randomGenerator.nextInt((rangeMax - inputInt) + 1) + inputInt; //izsaucam metodi
                System.out.println(randomNumber);
            }

            if (inputString.equals("mazaks")) {
                randomNumber = randomGenerator.nextInt((inputInt - 0) + 1) + 0; //izsaucam metodi
                System.out.println(randomNumber);
            }*/

            if (inputString.equals("lielaks")) {
                randomNumber = randomGenerator.nextInt((rangeMax - inputInt) + 1) + inputInt; //izsaucam metodi
                System.out.println(randomNumber);
            } else if (inputString.equals("mazaks")) {
                randomNumber();
            }

            inputInt = randomNumber;
        } while (!inputString.equals("vienads"));
        System.out.println("Programma uzmineja skaitli");
    }

    private void randomNumber() {
        randomNumber = randomGenerator.nextInt((inputInt) + 1);
        System.out.println(randomNumber);
    }

    private void scannerInt() {
        inputInt = scanner.nextInt();
    }

    private void scannerString() {
        inputString = scanner.next();
    }


}

package lv.Cikli;

import java.util.Random;
import java.util.Scanner;

public class Ugadaika {
    private int inputInt;
    private String inputString;
    private int randomNumber;
    private int rangeMax = 100;
    Scanner scanner = new Scanner(System.in);
    Random randomGenerator = new Random();

    public int getInputInt() {
        return inputInt;
    }

    public void setInputInt(int inputInt) {
        this.inputInt = inputInt;
    }

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public int getRangeMax() {
        return rangeMax;
    }

    public void setRangeMax(int rangeMax) {
        this.rangeMax = rangeMax;
    }

    public void numberCheck() {
        userNumberInput();
        randomNumber = randomGenerator.nextInt((rangeMax - 0) + 1) + 0;
        System.out.println(randomNumber);
        checkLoop();
    }

    private void userNumberInput() {
        do {
            System.out.println("Ievadiet numuru no 1 lidz 100");
            scannerInt();
        }
        while ( (inputInt < 0) || (inputInt > 100));
    }

    private void checkLoop() {
        do {
            System.out.println("ievadiet, skaitlis ir lielaks, vienads vai mazaks");
            scannerString();
            if (inputString.equals("lielaks")) {
                randomNumber = randomGenerator.nextInt((rangeMax - inputInt) + 1) + inputInt;
                System.out.println(randomNumber);
            }

            if (inputString.equals("mazaks")) {
                randomNumber = randomGenerator.nextInt((inputInt - 0) + 1) + 0;
                System.out.println(randomNumber);
            }
            inputInt = randomNumber;
        } while (!inputString.equals("vienads"));
        System.out.println("Programma uzmineja skaitli");
    }

    private void scannerInt() {
        inputInt = scanner.nextInt();
    }

    private void scannerString() {
        inputString = scanner.next();
    }


}

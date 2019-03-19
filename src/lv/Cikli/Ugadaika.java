package lv.Cikli;

import java.util.Random;
import java.util.Scanner;

public class Ugadaika {
    public int inputInt;
    public String inputString;
    public int randomNumber;
    public int random = 101;
    Scanner scanner = new Scanner(System.in);
    Random randomGenerator = new Random();

    public void numberCheck() {
        System.out.println("Ievadiet numuru no 1 lidz 100");
        scannerInt();
        randomNumber = randomGenerator.nextInt(random);
        System.out.println(randomNumber);
        checkLoop();
    }

    public void checkLoop() {
        do{
            System.out.println("ievadiet, skaitlis ir lielaks, vienads vai mazaks");
            scannerString();
            if (inputString.equals("lielaks")) {
                randomNumber = randomGenerator.nextInt((random - inputInt) + 1) + inputInt;
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

    public void scannerInt() {
        inputInt = scanner.nextInt();
    }

    public void scannerString() {
        inputString = scanner.next();
    }


}

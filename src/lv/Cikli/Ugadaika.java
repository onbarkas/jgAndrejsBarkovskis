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
        System.out.println("ievadiet, skaitlis ir lielaks, vienads vai mazaks");
        scannerString();
       //
      //  System.out.println(randomNumber);
        for (int i = 0; !inputString.equals("vienads"); i++) {
            System.out.println("ievadiet, skaitlis ir lielaks, vienads vai mazaks");
            scannerString();
            if (inputString.equals("lielaks")) {
                randomNumber = randomGenerator.nextInt((random - inputInt) + 1) + inputInt;
                System.out.println(randomNumber);
            }

            if (inputString.equals("vienads")) {
                System.out.println("Jus uzminejat");
                break;
            }

            if (inputString.equals("mazaks")) {
                randomNumber = randomGenerator.nextInt((random - inputInt) + 1) + inputInt;
                System.out.println(randomNumber);
            }
        }

    }

    public void scannerInt() {
        inputInt = scanner.nextInt();
    }

    public void scannerString() {
        inputString = scanner.next();
    }


}
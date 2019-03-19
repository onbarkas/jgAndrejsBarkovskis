package lv.Cikli;

import java.util.Random;
import java.util.Scanner;

public class Ugadaika {
    public int input;
    public int randomNumber;
    Scanner scanner = new Scanner(System.in);
    Random randomGenerator = new Random();

    public void numberCheck(){
        System.out.println("Ievadiet numuru no 1 lidz 100");
        scanner();
        random();
        for (int i=input; input!=randomNumber; i++){
            System.out.println("Ievadiet numuru no 1 lidz 100");
            scanner();
            random();
            //if ((input > 0) && (input <= 100)){

           // } else {System.out.println("Ievadiet numuru no 1 lidz 100");}
        }

    }

    public void scanner(){
        input = scanner.nextInt();
    }

    public void random(){
        randomNumber = randomGenerator.nextInt(101);
    }




}

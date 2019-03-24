package lv.homework.lesson2;

import java.util.Random;

public class RandomNumbersServiceTest {
    public static void main(String[] args) {
        int firstNumber = getRandom();
        int secondNumber = getRandom();
        int thirdNumber = getRandom();
        int randomNumbersSum = firstNumber + secondNumber + thirdNumber;
        System.out.println("Random numbers sum: " + randomNumbersSum);

    }

    public static int getRandom() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(50);
        randomNumber += 1;
        return randomNumber;
    }


}

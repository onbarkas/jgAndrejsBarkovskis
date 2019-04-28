package lv.homework.lesson2;

import java.util.Random;

public class RandomNumbersServiceTest {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int firstNumber = randomGenerator.nextInt(50);
        int secondNumber = randomGenerator.nextInt(50);
        int thirdNumber = randomGenerator.nextInt(50);
        int randomNumbersSum = firstNumber + secondNumber + thirdNumber;
        System.out.println("Random numbers sum: " + randomNumbersSum);
    }

/*
    public static int getRandom() {
        Random randomGenerator = new Random(); // katru reizi tiks veidots jauns Random objekts, to labak iznest klases līmenī vai nodot kā parametru
        int randomNumber = randomGenerator.nextInt(50);
        System.out.println(randomNumber);
        //randomNumber += 1;
        return randomNumber;
    }
*/


}

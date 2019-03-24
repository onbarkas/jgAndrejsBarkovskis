package lv.homework.lesson7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayService {
    Random randomGenerator = new Random();
    int n = randomGenerator.nextInt(10);
    int[] array1d;
    int sumInArray;

    public void create() {
        array1d = new int[n];
    }

    public void fillArrayWithRandomNumbers() {
        for (int i = 0; i < array1d.length; i++) {
            array1d[i] = randomGenerator.nextInt(100);
        }
    }

    public void printArrayToConsole() {
        System.out.println();
        for (int i = 0; i < array1d.length; i++) {
            System.out.print(array1d[i] + " ");
        }
    }

    public void sumInArray() {
        for (int i = 0; i < array1d.length; i++) {
            sumInArray = array1d[i] + sumInArray;
        }
        System.out.println("\nSum in array " + sumInArray);
    }

    public void sortArray() {
        Arrays.sort(array1d);
    }


    public void swap() {
        for (int i = 0; i < array1d.length; i++) {
            array1d[i] = -array1d[i];
        }
        Arrays.sort(array1d);
        for (int i = 0; i < array1d.length; i++) {
            array1d[i] = -array1d[i];
        }


    }

}


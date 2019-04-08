package lv.homework.lesson7;

import java.util.Arrays;
import java.util.Random;

public class ArrayService {
    Random randomGenerator = new Random();
    int n = randomGenerator.nextInt(10); //slikts mainīgā nosaukums , pie tam tas nav vajadzīgs
    int[] array1d;
    int sumInArray;

    public void create() {
        array1d = new int[n];
    }

    public void fillArrayWithRandomNumbers() {
        for (int i = 0; i < array1d.length; i++) {//for(int val : array1d) {
            array1d[i] = randomGenerator.nextInt(100);
        }
    }

    public void printArrayToConsole() {
        System.out.println();
        for (int i = 0; i < array1d.length; i++) {
            System.out.print(array1d[i] + " ");
        }

        //labak šādi
//        for(int val : array1d) {
//            System.out.println(val + " ");
//        }
    }

    public void sumInArray() {
        for (int i = 0; i < array1d.length; i++) { //for(int val : array1d) {
            sumInArray = array1d[i] + sumInArray;//sumInArray += array1d[i]
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


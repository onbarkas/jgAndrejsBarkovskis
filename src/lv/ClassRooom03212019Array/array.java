package lv.ClassRooom03212019Array;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        char[] hedgehog = new char[4];

        hedgehog[0] = 'e';
        hedgehog[1] = 'z';
        hedgehog[2] = 'i';
        hedgehog[3] = 's';

        for (int i = 0; i < hedgehog.length; i++) {
            System.out.print(hedgehog[i]);
        }
        System.out.println();

        for(char character :hedgehog){
            System.out.println(character);
        }

    }
}

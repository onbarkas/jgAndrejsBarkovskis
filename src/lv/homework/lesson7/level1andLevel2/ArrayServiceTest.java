package lv.homework.lesson7.level1andLevel2;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        arrayService.create();
        arrayService.fillArrayWithRandomNumbers();
        arrayService.printArrayToConsole();
        arrayService.sumInArray();
        arrayService.sortArray();
        arrayService.printArrayToConsole();
        arrayService.swap();
        arrayService.printArrayToConsole();
    }
}

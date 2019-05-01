package lv.homework.lesson6.level1;

public class NumberServiceTest {
    public static void main(String[] args) {
        NumberService numberService = new NumberService();

        System.out.println("Sum in range is " + numberService.sumInRange(2, 20));
        numberService.getEvenNumberCount(2, 20);
    }
}

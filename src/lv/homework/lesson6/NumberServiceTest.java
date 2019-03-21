package lv.homework.lesson6;

public class NumberServiceTest {
    public static void main(String[] args) {
        NumberService numberService = new NumberService();

        numberService.sumInRange(2, 20);
        numberService.sumInRange(20, 2);
        numberService.getEvenNumberCount(2,20);
        numberService.getEvenNumberCount(20,2);
    }
}

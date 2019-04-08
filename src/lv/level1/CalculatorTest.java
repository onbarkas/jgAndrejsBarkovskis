package lv.level1;

//Ok
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator FirstCalculator = new Calculator();
        int sumResult = FirstCalculator.sum(5, 5);
        int sumSubtrac = FirstCalculator.subtrac(6, 8);
        int sumMultiply = FirstCalculator.multiply(4, 9);
        double sumDevide = FirstCalculator.devide(6, 9);
        System.out.println(sumResult);
        System.out.println(sumSubtrac);
        System.out.println(sumMultiply);
        System.out.println(sumDevide);

    }
}

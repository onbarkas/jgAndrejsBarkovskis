package lv.homework.lesson6;

public class PowerCalculator {
    private int sum = 1;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void pow(int number, int power) {
        if ((number > 0) && (power > 0)) {
            for (int i = 1; i <= power; i++) {
                sum = sum * number;
            }
            System.out.println(sum);
        } else {
            System.out.println("Var but tikai pozitivie skaitli");
        }

    }
}

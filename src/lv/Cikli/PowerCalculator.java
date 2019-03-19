package lv.Cikli;

public class PowerCalculator {
    private int sum = 1;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int pow(int number, int power) {
        for (int i = 1; i <= power; i++) {
            sum=sum*number;
        }return sum;

    }
}

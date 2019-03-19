package lv.Cikli;

public class PowerCalculator {
    public int sum = 1;

    public int pow(int number, int power) {
        for (int i = 1; i <= power; i++) {
            sum=sum*number;
        }return sum;

    }
}

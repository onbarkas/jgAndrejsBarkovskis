package lv.Cikli;

public class NumberService {
    int sum;

    public void sumInRange(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum = i + sum;
                System.out.format("%5d", i);
            }
            System.out.println("     Sum is " + sum);
            sum = 0;
        } else {
            for (int i = a; i >= b; i--) {
                sum = i + sum;
                System.out.format("%5d", i);
            }
            System.out.println("     Sum is " + sum);
            sum = 0;
        }
    }

    public void getEvenNumberCount(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 2 != 0) {
                    continue;
                }
                System.out.format("%5d", i);
            }
            System.out.println();
        } else {
            for (int i = a; i >= b; i--) {
                if (i % 2 != 0) {
                    continue;
                }
                System.out.format("%5d", i);
            }
            System.out.println();
        }

    }
}

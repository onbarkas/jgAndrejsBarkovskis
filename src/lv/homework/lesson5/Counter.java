package lv.homework.lesson5;

public class Counter {
    private int value = 0;
    private int step = 1;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if ((value > 0) && (value < 10)) {
            this.value = value;
        } else {
            clear();
        }

    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        if ((step > 0) && (step < 100)) {
            this.step = step;
        } else {
            clear();
        }
    }

    public void increment() {
        if ((getValue() + getStep()) <= 100) {
            value = value + step;
        }
    }

    public void decrement() {
        if ((getValue() - getStep()) < 0) {
            value = value - step;
        }
    }

    public void clear() {
        value = 0;
    }
}

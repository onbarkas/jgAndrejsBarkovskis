package lv.ClassRoom03072019;

public class BasicCounter {
    private int counter;

    BasicCounter() {
        clear();
    }

    public int getCounter() {
        return counter;
    }

    public void increment() {
        counter++;
    }

    public void decrement() {
        counter--;
    }

    public void clear() {
        counter = 0;
    }
}

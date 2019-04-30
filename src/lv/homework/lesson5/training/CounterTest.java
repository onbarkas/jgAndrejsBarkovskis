package lv.homework.lesson5.training;

public class CounterTest {
    public static void main(String[] args) {
        Counter counterTest = new Counter();

        counterTest.getValue();
        counterTest.getStep();

        counterTest.increment();
        counterTest.getValue();

        counterTest.setStep(3);
        counterTest.increment();
        counterTest.getValue();

        counterTest.setStep(2);
        counterTest.decrement();
        counterTest.getValue();

        counterTest.clear();
        counterTest.getValue();
        counterTest.setValue(50);

        counterTest.getValue();



    }
}

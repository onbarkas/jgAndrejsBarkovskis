package lv.homework.lesson2;

//Ok
public class MathOperations {
    public static void main(String[] args) {
        int firstNumber = 10, secondNumber = 15;

        int sumResult = firstNumber + secondNumber;
        int subtract = firstNumber - secondNumber;
        double divide = (double)firstNumber / (double)secondNumber;
        int multiply = firstNumber * secondNumber;

        System.out.println("Sum = " + sumResult + "\nSubtract = " + subtract + "\nDivide = " + divide + "\nMultiply = " + multiply);
    }
}

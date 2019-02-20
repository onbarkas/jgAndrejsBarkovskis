package lv.homework2;

public class Calculator {
    int sum(int firstNumber, int secondNumber){
        int result = firstNumber + secondNumber;
                return result;
    }
    int subtrac(int firstNumber, int secondNumber){
        int result = firstNumber - secondNumber;
        return result;
    }
    int multiply(int firstNumber, int secondNumber){
        int result = firstNumber * secondNumber;
        return result;
    }
    double devide(int firstNumber, int secondNumber){
        double result = firstNumber / (double) secondNumber;
        return result;
    }
}

package lv.homework.lesson4.training;

public class SignComparator {
    int number = 133;
    String result;

    public String compare(){
        if (number > 0 ) result = "Number is positive";
        else if (number == 0) result = "Number is equel to zero";
        else result = "Number is negative";
        return result;
    }
}

package lv.IfHomework;

public class SignComparator {
    int number = 0;
    String result;

    public String compare(){
        if (number > 0 ) result = "Number is positive";
        else if (number == 0) result = "Number is equel to zero";
        else result = "Number is negative";
        return result;
    }
}

package lv.homework.lesson4;

public class DogAgeCalculator {
    public int DogToHumanConvertation(int dogYears){
        int humanYears;
        if (dogYears < 15) {humanYears = 0;}
        else if ((dogYears >= 15) && (dogYears < 24)) {humanYears = 1;}
        else if ((dogYears >= 24) && (dogYears < 28)) {humanYears = 2;}
        else humanYears = ((dogYears - 24)/4) + 2 ;
        return humanYears;
    }

    public int HumanToDogConvertation(int humanYears){
        int dogYears;
        if (humanYears == 1){
            dogYears = 15;
        } else if (humanYears == 2){
            dogYears = 24;
        } else {
            dogYears = ((humanYears - 2) * 4) + 24;
        }
    return dogYears;
    }
}

package lv.homework.lesson4;

public class DogAgeCalculatorTest {
    public static void main(String[] args) {
        DogAgeCalculatorTest convertorTest = new DogAgeCalculatorTest();
        convertorTest.shouldbeOneHumanYear();
        convertorTest.shouldbeTwoHumanYear();
        convertorTest.shouldbeThreeHumanYear();
        convertorTest.shouldbeFifteenDogYear();
        convertorTest.shouldbeTventyFourDogYear();
        convertorTest.shouldbeTventyEightDogYear();
    }

    public void shouldbeOneHumanYear() {
        DogAgeCalculator convertor = new DogAgeCalculator();
        int result = convertor.DogToHumanConvertation(15);
        compareHumanYearsResult((result == 1), "shouldbeOneHumanYear");
    }

    public void shouldbeTwoHumanYear() {
        DogAgeCalculator convertor = new DogAgeCalculator();
        int result = convertor.DogToHumanConvertation(24);
        compareHumanYearsResult((result == 2), "shouldbeTwoHumanYear");
    }

    public void shouldbeThreeHumanYear() {
        DogAgeCalculator convertor = new DogAgeCalculator();
        int result = convertor.DogToHumanConvertation(30);
        compareHumanYearsResult((result == 3), "shouldbeThreeHumanYear");
    }

    public void shouldbeFifteenDogYear() {
        DogAgeCalculator convertor = new DogAgeCalculator();
        int result = convertor.HumanToDogConvertation(1);
        compareHumanYearsResult((result == 15), "shouldbeFifteenDogYear");
    }

    public void shouldbeTventyFourDogYear() {
        DogAgeCalculator convertor = new DogAgeCalculator();
        int result = convertor.HumanToDogConvertation(2);
        compareHumanYearsResult((result == 24), "shouldbeTventyFourDogYear");
    }

    public void shouldbeTventyEightDogYear() {
        DogAgeCalculator convertor = new DogAgeCalculator();
        int result = convertor.HumanToDogConvertation(3);
        compareHumanYearsResult((result == 28), "shouldbeTventyEightDogYear");
    }


    void compareHumanYearsResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }


    }
}


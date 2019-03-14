package lv.Loop;

public class PrimeNumberFinder {
    public static void main(String[] args) {

        int primeFalse = 7;
        int primeTrue = 6;

        isPrimeNumber(primeFalse);
        isPrimeNumber(primeTrue);
    }

    private static void isPrimeNumber(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;

                break;
            }System.out.println(i);
        }

        System.out.println("The number {" + number + "} "
                + (isPrime ? " IS " : " ISN'T ") + " prime number");
    }
}

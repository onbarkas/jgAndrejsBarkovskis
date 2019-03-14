package lv.Loop;

public class ClassRoom {
    public static void main(String[] args) {
        printNumbersWithFor();
        printNumbersWithWhile();
        printNumbersWithDoWhile();
        printNumbersUsingBreakAndContiniues();
    }

    private static void printNumbersUsingBreakAndContiniues() {
        for (int i = 0; i <= 10; i++) {
            if (i == 4) {
                System.out.println("Break");
                break;
            }
            if (i == 2) {
                System.out.println("Continue");
                continue;
            }
            System.out.print(i + " ");
        }
    }

    private static void printNumbersWithWhile() {
        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(" ");
    }

    private static void printNumbersWithFor() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    private static void printNumbersWithDoWhile() {
        int i = 0;
        do {

            System.out.print(i + " ");
            i++;
        } while (i <= 10);
        System.out.println(" ");
    }


}

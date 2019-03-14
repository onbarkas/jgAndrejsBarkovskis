package lv.Loop;

public class MultiplicationTable {
    private int width;
    private int lenght;

    public MultiplicationTable(int width, int lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public void print() {

        printHeaders();

        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= lenght; j++) {
                System.out.format("%4d", i * j);
            }
            System.out.println();
        }
    }

    private void printHeaders() {
        for (int i = 1; i <= lenght; i++) {
            System.out.format(i > 9 ? "%5d" : "%4d", i);
        }
        System.out.println();

        for (int i = 1; i < lenght; i++){
            System.out.print("-----");
        }
        System.out.println();
    }


}

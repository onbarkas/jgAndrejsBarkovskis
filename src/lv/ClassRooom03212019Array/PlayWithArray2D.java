package lv.ClassRooom03212019Array;


public class PlayWithArray2D {
    public static void main(String[] args) {
        int[][] array2D = new int[][]{
                {1, 5, 4},
                {1, 5, 6, 4},
                {1, 8, 4, 5, 4}
        };

        print(array2D);
    }

    private static void print(int[][] array2D) {
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + ", ");
            }
            System.out.println();
        }
    }
}

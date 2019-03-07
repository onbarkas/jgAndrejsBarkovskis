package lv.ClassRoom03072019;

public class CandyBoxTest {
    public static void main(String[] args) {
        CandyBox candyBox = new CandyBox("Prozit", 8);

        System.out.println("CandyBox name: " + candyBox.getName() + ", amount: " + candyBox.getAmount());

        System.out.println(candyBox);
    }
}

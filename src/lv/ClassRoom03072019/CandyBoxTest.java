package lv.ClassRoom03072019;

public class CandyBoxTest {
    public static void main(String[] args) {
        TestCandyBoxToString();
    }

    private static void TestCandyBoxToString() {
        CandyBox candyBox = new CandyBox("Prozit", 8);

        String expected = "CandyBox: {name: Prozit, amount: 8}";

        System.out.print("ToString Test ");

        if (expected.equals(candyBox.toString())) {
            System.out.println("PASSED");
        } else{
            System.out.println("FAILED");
        }

        System.out.println("CandyBox name: " + candyBox.getName() + ", amount: " + candyBox.getAmount());

        System.out.println(candyBox);
    }
}

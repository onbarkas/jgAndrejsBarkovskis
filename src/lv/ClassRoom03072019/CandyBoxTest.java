package lv.ClassRoom03072019;

public class CandyBoxTest {
    public static void main(String[] args) {
        TestCandyBoxToString();
        testCandyBoxEquals();
    }

    private static void testCandyBoxEquals() {
        CandyBox prozitCB1 = new CandyBox("Prozit",8);
        CandyBox prozitCB2 = new CandyBox("Prozit",8);
        boolean expectedEquals = true;

        System.out.print("Objects equals true Test ");
        boolean actual = prozitCB1.equals(prozitCB2);
        if (actual){
            System.out.println("PASSED");
        } else{
            System.out.println("FAILED");
            System.out.println("Expected " + expectedEquals);
            System.out.println("Actual " + actual);
        }
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

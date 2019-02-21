package lv.ClassRoomTest;

public class QuickMathTest {
    public void shouldABeGreaterThanB(){
        QuickMath victim = new QuickMath();

        int a = 10;
        int b = 6;
        int expectedresult = 10;
        int actualResult = victim.max(a, b);

        if (actualResult == expectedresult){
            System.out.println("Test  shouldABeGreaterThanB has passed");
        } else {
            System.out.println("Test  shouldABeGreaterThanB has failed");
            System.out.println("Expected " + expectedresult + " but was  " + actualResult);
        }
    }

    public static void main(String[] args) {
        QuickMathTest test = new QuickMathTest();
        test.shouldABeGreaterThanB();
    }
}

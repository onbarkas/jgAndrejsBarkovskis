package lv.IfHomework;

public class NoiseLevelDetectorTest {
    public static void main(String[] args) {
        NoiseLevelDetectorTest test = new NoiseLevelDetectorTest();
        test.shouldDetectJackhammer();


    }

    public void shouldDetectJackhammer(){
        NoiseLevelDetector detector = new NoiseLevelDetector();
        String result = detector.detect(300);
        compareResult(result.equals("Jackhammer"), "shouldDetectJackhammer");
    }

    void compareResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}

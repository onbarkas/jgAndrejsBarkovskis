package lv.IfHomework;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest ColorDetectTest = new LightColorDetectorTest();
        LightColorDetector ColorDetect = new LightColorDetector();
        System.out.println(ColorDetect.detect(300));
        ColorDetectTest.shouldDetectColorVioleta();
        ColorDetectTest.shouldDetectColorZila();
        ColorDetectTest.shouldDetectColorZalja();
        ColorDetectTest.shouldDetectColorDzeltena();
        ColorDetectTest.shouldDetectColorOranza();
        ColorDetectTest.shouldDetectColorSarkana();
    }

    public void shouldDetectColorVioleta() {
        LightColorDetector ColorDetect = new LightColorDetector();
        String result = ColorDetect.detect(380);
        compareDetectedColor(result.equals("Violeta"), "ShouldDetectColorVioleta");
    }
    public void shouldDetectColorZila() {
        LightColorDetector ColorDetect = new LightColorDetector();
        String result = ColorDetect.detect(450);
        compareDetectedColor(result.equals("Zila"), "ShouldDetectColorZila");
    }
    public void shouldDetectColorZalja() {
        LightColorDetector ColorDetect = new LightColorDetector();
        String result = ColorDetect.detect(495);
        compareDetectedColor(result.equals("Zalja"), "ShouldDetectColorZalja");
    }
    public void shouldDetectColorDzeltena() {
        LightColorDetector ColorDetect = new LightColorDetector();
        String result = ColorDetect.detect(570);
        compareDetectedColor(result.equals("Dzeltena"), "ShouldDetectColorDzeltena");
    }
    public void shouldDetectColorOranza() {
        LightColorDetector ColorDetect = new LightColorDetector();
        String result = ColorDetect.detect(590);
        compareDetectedColor(result.equals("Oranza"), "ShouldDetectColorOranza");
    }
    public void shouldDetectColorSarkana() {
        LightColorDetector ColorDetect = new LightColorDetector();
        String result = ColorDetect.detect(620);
        compareDetectedColor(result.equals("Sarkana"), "ShouldDetectColorSarkana");
    }

    void compareDetectedColor(boolean result, String testName) {
        if (result)
            System.out.println(testName + " OK");
        else
            System.out.println(testName + " Fail");
    }
}

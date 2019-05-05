package lv.homework.lesson4.level1;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest colorDetectTest = new LightColorDetectorTest();
        colorDetectTest.shouldDetectColorViolet();
        colorDetectTest.shouldDetectColorBlue();
        colorDetectTest.shouldDetectColorGreen();
        colorDetectTest.shouldDetectColorYellow();
        colorDetectTest.shouldDetectColorOrange();
        colorDetectTest.shouldDetectColorRed();
        colorDetectTest.shouldDontDetectColor();
    }

    private void shouldDetectColorViolet() {
        LightColorDetector ColorDetect = new LightColorDetector();
        String result = ColorDetect.detect(380);
        compareDetectedColor(result.equals("Violet"), "ShouldDetectColorViolet");
    }

    private void shouldDetectColorBlue() {
        LightColorDetector ColorDetect = new LightColorDetector();
        String result = ColorDetect.detect(450);
        compareDetectedColor(result.equals("Blue"), "ShouldDetectColorBlue");
    }

    private void shouldDetectColorGreen() {
        LightColorDetector ColorDetect = new LightColorDetector();
        String result = ColorDetect.detect(495);
        compareDetectedColor(result.equals("Green"), "ShouldDetectColorGreen");
    }

    private void shouldDetectColorYellow() {
        LightColorDetector ColorDetect = new LightColorDetector();
        String result = ColorDetect.detect(570);
        compareDetectedColor(result.equals("Yellow"), "ShouldDetectColorYellow");
    }

    private void shouldDetectColorOrange() {
        LightColorDetector ColorDetect = new LightColorDetector();
        String result = ColorDetect.detect(590);
        compareDetectedColor(result.equals("Orange"), "ShouldDetectColorOrange");
    }

    private void shouldDetectColorRed() {
        LightColorDetector ColorDetect = new LightColorDetector();
        String result = ColorDetect.detect(620);
        compareDetectedColor(result.equals("Red"), "ShouldDetectColorRed");
    }

    private void shouldDontDetectColor() {
        LightColorDetector ColorDetect = new LightColorDetector();
        String result = ColorDetect.detect(6200);
        compareDetectedColor(result.equals("Can not see color"), "shouldDontDetectColor");
    }

    private void compareDetectedColor(boolean result, String testName) {
        System.out.println(testName + (result ? " OK" : " Fail"));
    }
}


/*package lv.homework.lesson4.level1andLevel2;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest ColorDetectTest = new LightColorDetectorTest(); //mainīgie ar mazo burtu sākas
        LightColorDetector ColorDetect = new LightColorDetector();//mainīgie ar mazo burtu sākas
        System.out.println(ColorDetect.detect(300));
        ColorDetectTest.shouldDetectColorVioleta();
        ColorDetectTest.shouldDetectColorZila();
        ColorDetectTest.shouldDetectColorZalja();
        ColorDetectTest.shouldDetectColorDzeltena();
        ColorDetectTest.shouldDetectColorOranza();
        ColorDetectTest.shouldDetectColorSarkana();
    }

    public void shouldDetectColorVioleta() {  //lietojam tikai angļu valodu
        LightColorDetector ColorDetect = new LightColorDetector();
        String result = ColorDetect.detect(380);
        compareDetectedColor(result.equals("Violeta"), "ShouldDetectColorVioleta");
    }
    public void shouldDetectColorZila() { //lietojam tikai angļu valodu
        LightColorDetector ColorDetect = new LightColorDetector();
        String result = ColorDetect.detect(450);
        compareDetectedColor(result.equals("Zila"), "ShouldDetectColorZila");
    }
    public void shouldDetectColorZalja() { //lietojam tikai angļu valodu
        LightColorDetector ColorDetect = new LightColorDetector();
        String result = ColorDetect.detect(495);
        compareDetectedColor(result.equals("Zalja"), "ShouldDetectColorZalja");
    }
    public void shouldDetectColorDzeltena() {//lietojam tikai angļu valodu
        LightColorDetector ColorDetect = new LightColorDetector();
        String result = ColorDetect.detect(570);
        compareDetectedColor(result.equals("Dzeltena"), "ShouldDetectColorDzeltena");
    }
    public void shouldDetectColorOranza() {//lietojam tikai angļu valodu
        LightColorDetector ColorDetect = new LightColorDetector();
        String result = ColorDetect.detect(590);
        compareDetectedColor(result.equals("Oranza"), "ShouldDetectColorOranza");
    }
    public void shouldDetectColorSarkana() {//lietojam tikai angļu valodu
        LightColorDetector ColorDetect = new LightColorDetector();
        String result = ColorDetect.detect(620);
        compareDetectedColor(result.equals("Sarkana"), "ShouldDetectColorSarkana");
    }

    void compareDetectedColor(boolean result, String testName) {
        //šo labāk rakstīt šādi:
//        System.out.println(testName + (result ? " OK" : " Fail"));
        if (result)
            System.out.println(testName + " OK");
        else
            System.out.println(testName + " Fail");
    }
}*/


package lv.homework.lesson5.training;

public class SmartPhoneTest {
    public static void main(String[] args) {
        SmartPhone iPhoneXs = new SmartPhone();
        iPhoneXs.setColor("Space grey");
        iPhoneXs.setManufactor("Apple");
        iPhoneXs.setProcessorType("Hexa-Core");
        iPhoneXs.setScreenSize(6.5);

        SmartPhone iPhoneX = new SmartPhone();
        iPhoneX.setColor("Space grey");
        iPhoneX.setManufactor("Apple");
        iPhoneX.setProcessorType("Hexa-Core");
        iPhoneX.setScreenSize(5.8);

        System.out.println(iPhoneXs);
        System.out.println("VS");
        System.out.println(iPhoneX);
        System.out.println("Equels result: " + iPhoneXs.equals(iPhoneX));
    }
}

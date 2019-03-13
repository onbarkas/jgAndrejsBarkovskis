package lv.ObjektiAtminja;

public class SmartPhoneTest {
    public static void main(String[] args) {
        SmartPhone iPhoneXs = new SmartPhone();
        iPhoneXs.setColor("Space grey");
        iPhoneXs.setManufactor("Apple");
        iPhoneXs.setProcessorType("Hexa-Core");
        iPhoneXs.setScreenSize(6.5);

        SmartPhone iPhoneX = new SmartPhone();
        iPhoneXs.setColor("Space grey");
        iPhoneXs.setManufactor("Apple");
        iPhoneXs.setProcessorType("Hexa-Core");
        iPhoneXs.setScreenSize(6.5);
        System.out.println(iPhoneX.getColor());

        System.out.println(iPhoneXs);
        System.out.println("VS");
        System.out.println(iPhoneX);
        System.out.println("Equels result: " + iPhoneXs.equals(iPhoneX));
    }
}

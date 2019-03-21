package lv.homework.lesson5;

public class TVTest {
    public static void main(String[] args) {
        TV onePlus = new TV();
        onePlus.setTurnedOn(true);
        onePlus.setCurrentChanel(6);
        onePlus.setCurrentVolumeLevel(25);
        onePlus.setManufacturer("One Plus");
        onePlus.decreaseVolume();
        onePlus.turnOf();
        onePlus.decreaseVolume();
        System.out.println(onePlus);

        TV LG = new TV();
        LG.turnOn();
        LG.setManufacturer("LG");
        LG.setCurrentChanel(7);
        LG.setCurrentVolumeLevel(47);
        System.out.println(LG);

        System.out.println("Equels result: " + onePlus.equals(LG));


    }
}

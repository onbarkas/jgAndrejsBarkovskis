package lv.ClassRoom03282019.Fauna;

public class LiveFauna {
    public static void main(String[] args) {
        Deer rudolf = new Deer();
        Viper doge = new Viper();
        Salmon goldy = new Salmon();

        living(doge);
        living(rudolf);
        doge.dropSkin();
        living(goldy);
        goldy.swim();
    }

    private static void living(Animal animal) {
        animal.eat();
        animal.poop();
        animal.sleep();

        if (animal instanceof Fish){
            ((Fish)animal).swim();
        }
    }
}

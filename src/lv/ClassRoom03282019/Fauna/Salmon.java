package lv.ClassRoom03282019.Fauna;

public class Salmon extends Fish {
    @Override
    void swim() {
        System.out.println(getFishName()+ " is swimming");
    }

    @Override
    String getFishName() {
        return "Wild Salmon";
    }

    @Override
    public void poop() {
        System.out.println(getFishName()+ " is pooping");
    }

    @Override
    public void sleep() {
        System.out.println(getFishName()+" is sleeping");
    }
}

package lv.ClassRoom03282019.Fauna;

abstract class Fish implements Animal {

    abstract void swim();

    abstract String getFishName();

    @Override
    public void eat() {
        System.out.println(getFishName() + " is eating");
    }

    public void makaBubbles() {
        System.out.println(getFishName() + " is making bubbles");
    }

}

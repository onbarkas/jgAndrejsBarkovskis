package lv.ClassRoom03282019.Fauna;

class Deer implements Animal {
    @Override
    public void eat() {
        System.out.println("Deer is eating");
    }

    @Override
    public void poop() {
        System.out.println("Deer is pooping");
    }

    @Override
    public void sleep() {
        System.out.println("Deer is sleeping");
    }
}

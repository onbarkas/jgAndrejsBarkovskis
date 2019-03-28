package lv.ClassRoom03282019.Fauna;

class Viper implements Animal {
    @Override
    public void eat() {
        System.out.println("Viper is eating");
    }

    @Override
    public void poop() {
        System.out.println("Viper is pooping");
    }

    @Override
    public void sleep() {
        System.out.println("Viper is sleeping");
    }

    public void dropSkin(){
        System.out.println("Viper is dropping the skin");
    }
}

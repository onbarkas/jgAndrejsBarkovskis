package lv.homework1;

public class DogTest {
    public static void main(String[] args) {
        Dog flufy = new Dog();
        flufy.setName("Flufy");
        flufy.setAge(25);
        flufy.setColor("White");
        System.out.println("My dog's name is:" + flufy.getName());
        System.out.println(flufy.getName() + "'s color is " + flufy.getColor());
        System.out.println("And she is " + flufy.getAge() + " years old");
        System.out.println("helo");
        flufy.eat();
        flufy.voice();
        flufy.sleep();

    }
}

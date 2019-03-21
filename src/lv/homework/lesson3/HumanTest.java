package lv.homework.lesson3;

public class HumanTest {
    public static void main(String[] args) {
        Human John = new Human();
        John.setName("John");
        John.setAge(20);
        John.sayHi();
        System.out.println(" My name is " + John.getName() + ", I'm " + John.getAge() + " years old");
    }
}

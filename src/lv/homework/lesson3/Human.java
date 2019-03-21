package lv.homework.lesson3;

public class Human {
    private String name;
    private int age;

    public String getName() {
        return this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return  this.age = age;
    }

    public void setAge (int age){
        this.age = age;
    }

    public void sayHi (){
        System.out.print("Hi!");
    }
}

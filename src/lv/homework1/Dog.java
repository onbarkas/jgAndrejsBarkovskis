package lv.homework1;

public class Dog {

    private String name;
    private String color;
    private int age;

    public String getName(){
        return this.name;
            }

    public void setName(String name){
        this.name = name;
            }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void voice(){
        System.out.println("vau vau");
    }

    public  void eat(){
        System.out.println("eat");
    }

    public void sleep(){
        System.out.println("zzzzzzzz");
    }

}

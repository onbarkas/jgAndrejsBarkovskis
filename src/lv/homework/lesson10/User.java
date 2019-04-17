package lv.homework.lesson10;

public class User {
    private String name, userName;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean userValidationService() {
        if (age <= 0 || age >= 120) {
            return false;
        }
        if (name.length() < 3 || name.length() > 15 ||  name.isEmpty()) {
            return false;
        }
        if (userName.length() < 3 || userName.length() > 15 || userName.equals("")) {
            return false;
        }
        return true;
    }
}

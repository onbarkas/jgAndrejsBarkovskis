package lv.homework.lesson10;

import javax.xml.bind.ValidationException;

public class User {
    private String name, userName;
    private int age;

    public User(String name, String userName, int age) throws ValidationException {
        if (age <= 0 || age >= 120) {
            throw new ValidationException("age only can be from 0 to 120");
        }
        if (name.length() < 3 || name.length() > 15 || name.isEmpty()) {
            throw new ValidationException("name can consist from 3 to 15 symbols");
        }
        if (userName.length() < 3 || userName.length() > 15 || userName.equals("")) {
            throw new ValidationException("user name can consist from 3 to 15 symbols");
        }
        this.name = name;
        this.userName = userName;
        this.age = age;
    }

    public boolean userValidationService() {
        if (age <= 0 || age >= 120) {
            return false;
        }
        if (name.length() < 3 || name.length() > 15 || name.isEmpty()) {
            return false;
        }
        if (userName.length() < 3 || userName.length() > 15 || userName.equals("")) {
            return false;
        }
        return true;
    }
}

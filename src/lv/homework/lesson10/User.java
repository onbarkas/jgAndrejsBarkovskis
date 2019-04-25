package lv.homework.lesson10;

import javax.xml.bind.ValidationException;

public class User {
    private String name, lastName;
    private int age;  // datu tipam jabūt Objekta Integer - uzdevuma nosacījumi

    //validācijas daļu jaines atsevišķā metodē - validation
    User(String name, String lastName, int age) throws ValidationException {
        if (age <= 0 || age >= 120) {
            throw new ValidationException("age only can be from 0 to 120");
        }
        if (name.length() < 3 || name.length() > 15) {
            throw new ValidationException("Name can consist from 3 to 15 symbols");
        }
        if (lastName.length() < 3 || lastName.length() > 15) {
            throw new ValidationException("Last name can consist from 3 to 15 symbols");
        }
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    //metode dublē loģiku - nav nepieciešama
    boolean userValidationService() {
        if (age <= 0 || age >= 120) {
            return false;
        }
        if (name.length() < 3 || name.length() > 15) {
            return false;
        }
        if (lastName.length() < 3 || lastName.length() > 15) {
            return false;
        }
        return true;
    }
}

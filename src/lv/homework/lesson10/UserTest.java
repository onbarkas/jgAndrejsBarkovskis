package lv.homework.lesson10;

import javax.xml.bind.ValidationException;

public class UserTest {
    public static void main(String[] args) throws ValidationException {
        User user = new User("Andrejs", "Barkovskis;", 320);
        System.out.println(user.userValidationService() ? "validation success" : "validation unsuccessful");
    }
}

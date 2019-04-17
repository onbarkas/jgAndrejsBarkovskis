package lv.homework.lesson10;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("Andrejs", "Barkovskis", 32);
        System.out.println(user.userValidationService() ? "validation success" : "validation unseccessfull");
    }
}

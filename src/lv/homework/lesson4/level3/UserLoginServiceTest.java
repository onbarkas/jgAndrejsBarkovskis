package lv.homework.lesson4.level3;

public class UserLoginServiceTest {
    public static void main(String[] args) {
        User user = new User();
        UserLoginService userLogin = new UserLoginService(user);

        userLogin.login("Parole1", "Lietotajs");
        userLogin.login("Parole1", "Lietotajs");
        userLogin.login("Parole", "Lietotajs1");
        userLogin.login("Parole", "Lietotajs");
    }

}

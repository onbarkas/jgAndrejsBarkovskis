package lv.IfHomework;

public class UserLoginServiceTest {
    public static void main(String[] args) {
        UserLoginService userLogin = new UserLoginService();
        User userClass = new User();

        userLogin.login("Parole", "Lietotajs");
        userClass.block();
        userLogin.verify();
        System.out.println(userClass.loginAttemptsLeft);
        userClass.resetLoginAttepts();
        System.out.println(userClass.loginAttemptsLeft);
    }

}

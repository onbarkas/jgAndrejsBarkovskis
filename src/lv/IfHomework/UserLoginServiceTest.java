package lv.IfHomework;

public class UserLoginServiceTest {
    public static void main(String[] args) {
        UserLoginService userLogin = new UserLoginService();
        User UserClass = new User();
       /* userLogin.login("Parole", "Lietotajs");*/
        userLogin.verify();
        System.out.println(UserClass.loginAttemptsLeft);
        UserClass.resetLoginAttepts();
        System.out.println(UserClass.loginAttemptsLeft);
    }

}

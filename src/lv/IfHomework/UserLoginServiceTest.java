package lv.IfHomework;

public class UserLoginServiceTest {
    public static void main(String[] args) {
        UserLoginService userLogin = new UserLoginService();
        User userClass = new User();

        userLogin.login("Parole", "Lietotajs");
        System.out.println(userClass.getPassword());
        ///userClass.block();
       /// userLogin.verify();
        System.out.println(userClass.getLoginAttemptsLeft());
        userClass.resetLoginAttepts();
        System.out.println(userClass.getLoginAttemptsLeft());
    }

}

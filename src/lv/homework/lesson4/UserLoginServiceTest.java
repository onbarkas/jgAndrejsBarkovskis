package lv.homework.lesson4;

public class UserLoginServiceTest {
    public static void main(String[] args) {
        User user = new User();
        UserLoginService userLogin = new UserLoginService(user);

        userLogin.login("Parole", "Lietotajs");
       // user.block();
        userLogin.verify();
        //System.out.println(user.getLoginAttemptsLeft());
//        System.out.println(userClass.getLoginAttemptsLeft());
//        System.out.println(userClass.getLoginAttemptsLeft());
//        System.out.println(userClass.getLoginAttemptsLeft());
//        userClass.resetLoginAttempts();
//        System.out.println(userClass.getLoginAttemptsLeft());
    }

}

package lv.IfHomework;

import java.util.Objects;

public class UserLoginService {
    ///  private String inputPasword;
    ///  private String user;
    User userClass = new User();

    public void login(String inputPassword, String user) {
        if ((userClass.password.equals(inputPassword)) && (userClass.login.equals(user))) {
            System.out.println("Lietotajs un parole ievaditi veiksmigi");
            userClass.loginAttemptsLeft--;
            System.out.println(userClass.loginAttemptsLeft);
        } else System.out.println("Nepareizais lietotaja vards vai parole");
    }

    public void verify() {
        if (userClass.loginAttemptsLeft <= 0) {
            userClass.block();
            System.out.println("noblokets");
        } else if (userClass.blocked == true) {
            System.out.println("Lietotajs ir noblokets");
        } else System.out.println("viss chotka");

    }


}


package lv.IfHomework;

public class UserLoginService {
    String inputPaswordChecker;
    String userChecker;
    User userClass = new User();

    public boolean login(String inputPassword, User user){
        return login();
    }

    public void verify(){
        if (userClass.loginAttemptsLeft > 2) {
            userClass.block();
            userClass.loginAttemptsLeft += 1;
            System.out.println("noblokets");
        } else if (userClass.blocked = true){
            System.out.println("Lietotajs ir noblokets");}
        else System.out.println("viss chotka");

        /*if((UserLoginService.login.inputPassword.equals(userClass.password)) && (user.equals(userClass.login))) {
                System.out.println("Jus ielagojaties");*/

        }



    }


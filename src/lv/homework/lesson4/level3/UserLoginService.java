package lv.homework.lesson4.level3;

class UserLoginService {
    private User userClass;

    UserLoginService(User userClass) {
        this.userClass = userClass;
    }

    void login(String inputPassword, String user) {
        if (userClass.getPassword().equals(inputPassword) && userClass.getLogin().equals(user)) {
            System.out.println(verify() ? "Lietotajs un parole ievaditi veiksmigi"
                    : "Lietotajs ir noblokets, ludzu grieztie pie administratora");
        } else if (!userClass.getPassword().equals(inputPassword) && userClass.getLogin().equals(user) && verify()) {
            userClass.decreaseLoginAttemptsLeft();
            System.out.println("Nepareiza parole, Jums palika " + userClass.getLoginAttemptsLeft() + " meginajumi");
        } else if (!userClass.getPassword().equals(inputPassword) && !userClass.getLogin().equals(user)
                || userClass.getPassword().equals(inputPassword) && !userClass.getLogin().equals(user)) {
            System.out.println("Nepareizais lietotaja vards vai parole");
        } else System.out.println("Lietotajs ir noblokets, ludzu grieztie pie administratora");
    }

    private boolean verify() {
        if (userClass.getLoginAttemptsLeft() <= 0 || userClass.getBlocked()) {
            userClass.block();
            return false;
        }
        return true;
    }
}


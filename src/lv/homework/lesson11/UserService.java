package lv.homework.lesson11;

import lv.homework.lesson10.User;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void createUser(){
        userRepository.save();
    }

}

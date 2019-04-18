package lv.homework.lesson11;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceTest {

    UserService victim;

    UserRepositoryMock userRepository;

    @Before
    public void setUp() throws Exception {
        userRepository = new UserRepositoryMock();
        victim = new UserService(userRepository);
    }

    @Test
    public void shouldSaveUser() {
        victim.createUser();
        assertTrue(userRepository.isTriggered());
    }
}
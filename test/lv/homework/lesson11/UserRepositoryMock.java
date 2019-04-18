package lv.homework.lesson11;

public class UserRepositoryMock extends UserRepository {
    private boolean isTriggered;

    @Override
    public void save() {
        isTriggered = true;
        System.out.println("Mock triggered");
    }

    public boolean isTriggered() {
        return isTriggered;
    }




}

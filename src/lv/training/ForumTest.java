package lv.training;

public class ForumTest {
    public static void main(String[] args) {
        User user = new User();
        Moderator moderator = new Moderator();
        Administrator administrator = new Administrator();
        user.readPost();
        user.writePost();
        moderator.readPost();
        moderator.writePost();
        moderator.blockPost();
        administrator.readPost();
        administrator.writePost();
        administrator.blockPost();
        administrator.blockUser();


    }
}

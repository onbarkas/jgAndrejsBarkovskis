package lv.homework.lesson7;

public class PalindromCheckTest {
    public static void main(String[] args) {
        PalindromCheck palindromCheck = new PalindromCheck();

        if (palindromCheck.isPalindrome()) {
            System.out.println("Rinda ir palindroms");
        } else{
            System.out.println("Rinda nav palindroms");
        }
    }
}

package lv.homework.lesson5;

//OK
public class BookTest {
    public static void main(String[] args) {
        Book cleanCode = new Book();
        cleanCode.setAuthor("Jhon");
        cleanCode.setTitle("Clean Code");
        cleanCode.setPageCount(548);

        Book javaEight = new Book();
        javaEight.setAuthor("Jhon");
        javaEight.setTitle("Java 8");
        javaEight.setPageCount(548);

        System.out.println(cleanCode);
        System.out.println(javaEight);
        System.out.println("Equels result: " + cleanCode.equals(javaEight));

    }
}

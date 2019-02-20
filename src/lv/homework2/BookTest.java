package lv.homework2;

public class BookTest {
    public static void main(String[] args) {
        Book firstBook = new Book();
        firstBook.setBookName("JavaBook");
        firstBook.setAutor("Nikolas");
        firstBook.setBookYear(2015);
        firstBook.setBookPages(1000);
        System.out.println("Book title is " + firstBook.getBookName());
        System.out.println("Book author is " + firstBook.getAutor());
        System.out.println("Year " + firstBook.getBookYear());
        System.out.println("Page count: " + firstBook.getBookPages());
    }
}

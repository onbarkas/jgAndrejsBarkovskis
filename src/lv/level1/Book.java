package lv.level1;

public class Book {
    private String autor, bookName;  //gramatikas kļūda
    private int bookYear, bookPages;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAutor() {
        return autor;
    } //gramatikas kļūda

    public void setAutor(String autor) {
        this.autor = autor;
    } //gramatikas kļūda

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    public int getBookPages() {
        return bookPages;
    }

    public void setBookPages(int bookPages) {
        this.bookPages = bookPages;
    }
}

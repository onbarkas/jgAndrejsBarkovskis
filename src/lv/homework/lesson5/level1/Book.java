package lv.homework.lesson5.level1;

import java.util.Objects;

public class Book {
    private String author, title;
    private int pageCount;

    private String getAuthor() {
        return author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    private String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    private int getPageCount() {
        return pageCount;
    }

    void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pageCount == book.pageCount &&
                author.equals(book.author) &&
                title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthor(), getTitle(), getPageCount());
    }


    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }
}

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        //geteru vietā izmanto tieši laukus: author == book.getPageCount()
        //jo metodē varbūt iekļauta papildus loģika
        return getPageCount() == book.getPageCount() &&
                getAuthor().equals(book.getAuthor()) &&
                getTitle().equals(book.getTitle());
    }
*/

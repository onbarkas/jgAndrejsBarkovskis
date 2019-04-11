package lv.ClassRoom4112019;


public class RepositoryDemo {
    public static void main(String[] args) {

        Repository<BookEntity> bookRepository = new BookRepository();

        bookRepository.save (new BookEntity(1,"sadas", "sdafadfsf"));
        bookRepository.save (new BookEntity(2,"sadas", "sdafadfsf"));
        bookRepository.save (new BookEntity(3,"sadas", "sdafadfsf"));
        bookRepository.save (new BookEntity(4,"sadas", "sdafadfsf"));
        bookRepository.save (new BookEntity(5,"sadas", "sdafadfsf"));

        System.out.println(bookRepository.findAll());
        System.out.println(bookRepository.findById(3L));
        bookRepository.delete(3L);

    }
}

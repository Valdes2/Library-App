package mate.academy.spring.dao;

import java.util.List;

import mate.academy.spring.entity.Author;
import mate.academy.spring.entity.Book;

public interface BookDao {

    void addBook(Book book);

    Book find(Long id);

    List<Book> findByTitle(String title);

    List<Book> findByAuthor(Author author);

    List<Book> listBooks();
}

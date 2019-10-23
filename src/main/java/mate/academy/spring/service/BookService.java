package mate.academy.spring.service;

import java.util.List;

import mate.academy.spring.entity.Author;
import mate.academy.spring.entity.Book;

public interface BookService {
    void addBook(Book book);

    List<Book> listBooks();

    Book find(Long id);

    List<Book> findByTitle(String title);

    List<Book> findByAuthor(Author author);
}

package mate.academy.spring.dao;

import java.util.List;

import mate.academy.spring.entity.Author;

public interface AuthorDao {
    void addAuthor(Author author);

    List<Author> findByName(String name);

    List<Author> findByNameAndSurname(String name, String surname);

    List<Author> allAuthors();
}

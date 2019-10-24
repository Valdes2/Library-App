package mate.academy.spring.service.impl;

import java.util.List;

import mate.academy.spring.dao.BookDao;
import mate.academy.spring.entity.Author;
import mate.academy.spring.entity.Book;
import mate.academy.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Transactional
    @Override
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Book> listBooks() {
        return bookDao.listBooks();
    }

    @Transactional(readOnly = true)
    @Override
    public Book find(Long id) {
        return bookDao.find(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Book> findByTitle(String title) {
        return bookDao.findByTitle(title);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Book> findByAuthor(Author author) {
        return bookDao.findByAuthor(author);
    }
}

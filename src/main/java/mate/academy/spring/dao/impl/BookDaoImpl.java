package mate.academy.spring.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import mate.academy.spring.dao.BookDao;
import mate.academy.spring.entity.Author;
import mate.academy.spring.entity.Book;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addBook(Book book) {
        sessionFactory.getCurrentSession().save(book);
    }

    @Override
    public Book find(Long id) {
        return sessionFactory.getCurrentSession().get(Book.class, id);
    }

    @Override
    public List<Book> findByTitle(String title) {
        TypedQuery<Book> query = sessionFactory
                .getCurrentSession().createQuery("from Book where title LIKE :title");
        query.setParameter("title", title);
        return query.getResultList();
    }

    @Override
    public List<Book> findByAuthor(Author author) {
        TypedQuery<Book> query = sessionFactory
                .getCurrentSession().createQuery("from Book where author=:author");
        query.setParameter("author", author);
        return query.getResultList();
    }

    @Override
    public List<Book> listBooks() {
        TypedQuery<Book> query = sessionFactory.getCurrentSession().createQuery("from Book");
        return query.getResultList();
    }
}

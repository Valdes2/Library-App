package mate.academy.spring.dao.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.TypedQuery;

import mate.academy.spring.dao.RentDao;
import mate.academy.spring.entity.Book;
import mate.academy.spring.entity.Rent;
import mate.academy.spring.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RentDaoImpl implements RentDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addRent(Rent rent) {
        sessionFactory.getCurrentSession().save(rent);
    }

    @Override
    public void returnBook(User user, Book book) {
        TypedQuery<Rent> query = sessionFactory
                .getCurrentSession()
                .createQuery("UPDATE Rent SET active = false WHERE user = :user AND book = :book");
        query.setParameter("user", user);
        query.setParameter("book", book);
        query.executeUpdate();
    }

    @Override
    public List<Book> getBooksRentByUser(User user) {
        TypedQuery<Rent> query = sessionFactory
                .getCurrentSession()
                .createQuery("FROM Rent WHERE user=:user AND active=:active");
        query.setParameter("user", user);
        query.setParameter("active", true);
        List<Book> books = query.getResultList()
                .stream()
                .map(x -> x.getBook())
                .collect(Collectors.toList());
        return books;
    }

    @Override
    public List<Rent> allRents() {
        TypedQuery<Rent> query = sessionFactory.getCurrentSession().createQuery("FROM Rent");
        return query.getResultList();
    }
}

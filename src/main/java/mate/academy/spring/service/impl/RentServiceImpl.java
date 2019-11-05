package mate.academy.spring.service.impl;

import java.time.LocalDate;
import java.util.List;

import mate.academy.spring.dao.RentDao;
import mate.academy.spring.entity.Book;
import mate.academy.spring.entity.Rent;
import mate.academy.spring.entity.User;
import mate.academy.spring.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RentServiceImpl implements RentService {

    @Autowired
    private RentDao rentDao;

    @Transactional
    @Override
    public Rent rentBook(User user, Book book) {
        Rent newRent = new Rent(LocalDate.now(), user, book);
        rentDao.addRent(newRent);
        return newRent;
    }

    @Transactional
    @Override
    public void returnBook(User user, Book book) {
        rentDao.returnBook(user, book);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Book> getBooksRentByUser(User user) {
        return rentDao.getBooksRentByUser(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Rent> allRents() {
        return rentDao.allRents();
    }
}

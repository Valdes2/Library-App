package mate.academy.spring.dao;

import java.util.List;

import mate.academy.spring.entity.Book;
import mate.academy.spring.entity.Rent;
import mate.academy.spring.entity.User;

public interface RentDao {

    void addRent(Rent rent);

    void returnBook(User user, Book book);

    List<Book> getBooksRentByUser(User user);

    List<Rent> allRents();
}

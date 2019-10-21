package mate.academy.spring;

import java.sql.SQLException;

import java.util.List;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.entity.Author;
import mate.academy.spring.entity.Book;
import mate.academy.spring.entity.User;
import mate.academy.spring.service.AuthorService;
import mate.academy.spring.service.BookService;
import mate.academy.spring.service.RentService;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        // Add Users
        User newUser = new User("Sunil", "Bora", "suni.bora@example.com");
        userService.add(newUser);
        userService.add(new User("David", "Miller", "david.miller@example.com"));
        userService.add(new User("Sameer", "Singh", "sameer.singh@example.com"));
        userService.add(new User("Paul", "Smith", "paul.smith@example.com"));

        // Get Users
        List<User> users = userService.listUsers();
        for (User user : users) {
            System.out.println("Id = " + user.getId());
            System.out.println("First Name = " + user.getFirstName());
            System.out.println("Last Name = " + user.getLastName());
            System.out.println("Email = " + user.getEmail());
            System.out.println();
        }

        AuthorService authorService = context.getBean(AuthorService.class);

        Author newAuthor = new Author("Tim","Root");
        authorService.addAuthor(newAuthor);
        authorService.findByNameAndSurname(newAuthor.getName(), newAuthor.getSurname());

        List<Author> authorsFindByName = authorService.findByName(newAuthor.getName());
        for (Author author :authorsFindByName) {
            System.out.println("Id = " + author.getId());
            System.out.println("Name = " + author.getName());
            System.out.println("Surname = " + author.getSurname());
            System.out.println();
        }

        BookService bookService = context.getBean(BookService.class);

        Book newBook = new Book("qqq", 1998, 30);
        bookService.addBook(newBook);
        bookService.addBook(new Book("qwe", 1967, 50));
        bookService.addBook(new Book("dfrr", 1954, 49));
        bookService.addBook(new Book("cvgg", 1956, 28));

        List<Book> books = bookService.listBooks();
        for (Book book: books) {
            System.out.println("Id = " + book.getId());
            System.out.println("Title = " + book.getTitle());
            System.out.println("Year = " + book.getYear());
            System.out.println("Price = " + book.getPrice());
            System.out.println();
        }

        RentService rentService = context.getBean(RentService.class);

        rentService.rentBook(newUser, newBook);
        rentService.returnBook(newUser, newBook);
        rentService.rentBook(newUser, newBook);

        List<Book> booksRentByUser = rentService.getBooksRentByUser(newUser);
        for (Book book : booksRentByUser) {
            System.out.println("Id = " + book.getId());
            System.out.println("Title = " + book.getTitle());
            System.out.println("Year = " + book.getYear());
            System.out.println("Price = " + book.getPrice());
            System.out.println();
        }

        context.close();
    }
}

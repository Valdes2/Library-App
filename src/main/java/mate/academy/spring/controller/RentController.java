package mate.academy.spring.controller;

import mate.academy.spring.entity.User;
import mate.academy.spring.security.SecurityService;
import mate.academy.spring.service.BookService;
import mate.academy.spring.service.RentService;
import mate.academy.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/rent")
public class RentController {
    //private static final Long USER_ID = 1L;

    @Autowired
    private RentService rentService;
    @Autowired
    private UserService userService;
    @Autowired
    private BookService bookService;
    @Autowired
    private SecurityService securityService;

    @GetMapping("/rentBook")
    public String rentBook(@RequestParam("book_id") Long bookId) {
        rentService.rentBook(securityService.getAuthenticatedUser(), bookService.find(bookId));
        return "forward:/rent/rentedBooks";
    }

    @GetMapping("/returnBook")
    public String returnBook(@RequestParam("book_id") Long bookId) {
        rentService.returnBook(securityService.getAuthenticatedUser(), bookService.find(bookId));
        return "forward:/rent/rentedBooks";
    }

    @GetMapping("/rentedBooks")
    public String getRentedBooks(Model model) {
        User user = securityService.getAuthenticatedUser();
        model.addAttribute("allBooks", rentService.getBooksRentByUser(user));
        return "book/allBooks";
    }

}

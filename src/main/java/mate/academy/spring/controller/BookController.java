package mate.academy.spring.controller;

import mate.academy.spring.entity.Book;
import mate.academy.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    public String getAllBooks(Model model) {
        model.addAttribute("allBooks", bookService.listBooks());
        return "book/allBooks";
    }

    @GetMapping("/find")
    public String findByTitle(@RequestParam("title") String title, Model model) {
        model.addAttribute("allBooks", bookService.findByTitle(title));
        return "book/allBooks";

    }

    @GetMapping("/{id}")
    public String getInfo(@PathVariable("id") Long id, Model model) {
        model.addAttribute("book", bookService.find(id));
        return "book/bookInfo";
    }

    @GetMapping("/addBook")
    public String addBookPage() {
        return "book/createBook";
    }

    @PostMapping("/addBook")
    public String addBook(@ModelAttribute Book book, Model model) {
        bookService.addBook(book);
        return getAllBooks(model);
    }
}

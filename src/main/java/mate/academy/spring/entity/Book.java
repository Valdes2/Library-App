package mate.academy.spring.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;
    @Column(name = "name")
    private String title;
    @Column(name = "year")
    private Integer year;
    @Column(name = "price")
    private Integer price;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "authors_books",
            joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id",
                    referencedColumnName = "author_id"))
    private List<Author> authors = new ArrayList<>();

    public Book() {
    }

    public Book(String title, Integer year, Integer price) {
        this.title = title;
        this.year = year;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}

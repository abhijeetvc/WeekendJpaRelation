package com.weekendjparelation.WeekendJpaRelation.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Created by abhi on 07/01/18.
 */

@Entity
public class BookCategory {

    @Id
    Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    String categoryName;

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @OneToMany(mappedBy = "bookCategory")
    Set<Book> books;


}

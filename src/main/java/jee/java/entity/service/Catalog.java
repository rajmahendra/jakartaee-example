package jee.java.entity.service;

import jee.java.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Book> bookList;

    public Catalog() {
        bookList = new ArrayList<>();
        bookList.add(Book.of("1","The Vault of Vishnu","Ashwin Sanghi",248.00));
        bookList.add(Book.of("2","Legend of Suheldev: The King Who Saved India","Amish",327.00));
        bookList.add(Book.of("3","The Secret Of The Palamu Fort","Razi",235.00));
        bookList.add(Book.of("5","The Mahabharata Secret ","Christopher C. Doyle",207.00));
    }

    public List<Book> getAllBooks() {return bookList;}

    public Book getAllBook(int index) {return bookList.get(index);}




}

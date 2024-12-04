package org.tw.example.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookRepository {
    private List<Book> books = new ArrayList<>();
    private int currentId = 1;

    public Book save(Book book) {
        book = new Book(currentId++, book.getTitle(), book.getAuthor());
        books.add(book);
        return book;
    }

    public Optional<Book> findById(int id) {
        return books.stream().filter(book -> book.getId() == id).findFirst();
    }

    public List<Book> findAll() {
        return new ArrayList<>(books);
    }

    public void deleteById(int id) {
        books.removeIf(book -> book.getId() == id);
    }
}

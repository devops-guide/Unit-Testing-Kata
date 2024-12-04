package org.tw.example.book;

import java.util.List;

public class BookService {
    private BookRepository bookRepository = new BookRepository();

    public Book addBook(String title, String author) {
        Book book = new Book(0, title, author); // id 由 Repository 生成
        return bookRepository.save(book);
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id).orElse(null);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }
}

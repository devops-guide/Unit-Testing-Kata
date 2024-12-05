package org.tw.kata5;

import java.util.List;

/**
 * 练习5：测试替身练习
 */
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

    public Book updateBookTitle(int id, String newTitle) {
        Book book = getBookById(id);
        if (book != null) {
            book.setTitle(newTitle);
            bookRepository.save(book);
        }
        return book;
    }
}

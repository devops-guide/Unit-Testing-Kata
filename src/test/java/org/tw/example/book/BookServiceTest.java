package org.tw.example.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookServiceTest {
    private BookService bookService;

    @BeforeEach
    void setUp() {
        bookService = new BookService();
    }

    @Test
    @DisplayName("测试添加书籍")
    void testAddBook() {
        Book book = bookService.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        assertNotNull(book);
        assertEquals("The Great Gatsby", book.getTitle());
        assertEquals("F. Scott Fitzgerald", book.getAuthor());
    }

    @Test
    void testGetBookById() {
        Book book = bookService.addBook("1984", "George Orwell");
        Book fetchedBook = bookService.getBookById(book.getId());
        assertNotNull(fetchedBook);
        assertEquals(book.getId(), fetchedBook.getId());
        assertEquals("1984", fetchedBook.getTitle());
    }

    @Test
    void testGetAllBooks() {
        bookService.addBook("To Kill a Mockingbird", "Harper Lee");
        bookService.addBook("The Catcher in the Rye", "J.D. Salinger");

        List<Book> books = bookService.getAllBooks();
        assertEquals(2, books.size());
    }

    @Test
    void testDeleteBook() {
        Book book = bookService.addBook("Moby Dick", "Herman Melville");
        bookService.deleteBook(book.getId());

        assertNull(bookService.getBookById(book.getId()));
    }
}

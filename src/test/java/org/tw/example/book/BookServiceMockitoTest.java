package org.tw.example.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class BookServiceMockitoTest {
    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddBook() {
        Book book = new Book(0, "The Great Gatsby", "F. Scott Fitzgerald");
        when(bookRepository.save(any(Book.class))).thenReturn(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));

        Book addedBook = bookService.addBook(book.getTitle(), book.getAuthor());
        assertNotNull(addedBook);
        assertEquals(1, addedBook.getId());
        assertEquals("The Great Gatsby", addedBook.getTitle());
        assertEquals("F. Scott Fitzgerald", addedBook.getAuthor());
        verify(bookRepository, times(1)).save(any(Book.class)); // 验证 save 方法被调用了一次
    }

    @Test
    void testGetBookById() {
        Book book = new Book(1, "1984", "George Orwell");
        when(bookRepository.findById(1)).thenReturn(Optional.of(book));

        Book fetchedBook = bookService.getBookById(1);
        assertNotNull(fetchedBook);
        assertEquals("1984", fetchedBook.getTitle());
        verify(bookRepository, times(1)).findById(1); // 验证 findById 方法被调用了一次
    }

    @Test
    void testGetAllBooks() {
        Book book1 = new Book(1, "To Kill a Mockingbird", "Harper Lee");
        Book book2 = new Book(2, "The Catcher in the Rye", "J.D. Salinger");
        when(bookRepository.findAll()).thenReturn(Arrays.asList(book1, book2));

        List<Book> books = bookService.getAllBooks();
        assertEquals(2, books.size());
        verify(bookRepository, times(1)).findAll(); // 验证 findAll 方法被调用了一次
    }

    @Test
    void testDeleteBook() {
        doNothing().when(bookRepository).deleteById(1);

        bookService.deleteBook(1);
        verify(bookRepository, times(1)).deleteById(1); // 验证 deleteById 方法被调用了一次
    }
}

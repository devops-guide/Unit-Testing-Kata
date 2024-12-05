package org.tw.kata5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookRepository {
    private List<Book> books = new ArrayList<>();
    private int currentId = 1;

    public Book save(Book book) {
        throw new RuntimeException("save 方法 mock 失败");
    }

    public Optional<Book> findById(int id) {
        throw new RuntimeException("findById 方法 mock 失败");
    }

    public List<Book> findAll() {
        throw new RuntimeException("findAll 方法 mock 失败");
    }

    public void deleteById(int id) {
        throw new RuntimeException("deleteById 方法 mock 失败");
    }
}

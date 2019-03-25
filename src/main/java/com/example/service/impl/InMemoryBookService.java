package com.example.service.impl;

import com.example.model.Book;
import com.example.service.BookService;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class InMemoryBookService implements BookService {

  private final Map<String, Book> books = new ConcurrentHashMap<>();

  @Override
  public Iterable<Book> findAll() {
    return books.values();
  }

  @Override
  public Book create(Book book) {
    books.put(book.getIsbn(), book);
    return book;
  }

  @Override
  public Optional<Book> find(String isbn) {
    return Optional.ofNullable(books.get(isbn));
  }
}

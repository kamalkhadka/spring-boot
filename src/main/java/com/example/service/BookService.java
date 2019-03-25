package com.example.service;

import com.example.model.Book;

import java.util.Optional;

public interface BookService {

  Iterable<Book> findAll();

  Book create(Book book);

  Optional<Book> find(String isbn);
}

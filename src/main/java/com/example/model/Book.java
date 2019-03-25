package com.example.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Book {
  private String title;
  private String isbn;
  private List<String> authors = new ArrayList<>();

  public Book() {
  }

  public Book(String title, String isbn, String... authors) {
    this.title = title;
    this.isbn = isbn;
    this.authors.addAll(Arrays.asList(authors));
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public List<String> getAuthors() {
    return authors;
  }

  public void setAuthors(List<String> authors) {
    this.authors = authors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Book book = (Book) o;
    return Objects.equals(isbn, book.isbn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isbn);
  }

  @Override
  public String toString() {
    return "Book{" +
            "title='" + title + '\'' +
            ", isbn='" + isbn + '\'' +
            ", authors=" + authors +
            '}';
  }
}

package com.example.controller;

import com.example.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

  private final BookService bookService;

  public BookController(BookService bookService){
    this.bookService = bookService;
  }

  @GetMapping("/books.html")
  public String list(Model model){
    model.addAttribute("books", bookService.findAll());
    return "books/list";
  }

  @GetMapping(value = "/books.html", params = "isbn")
  public String get(@RequestParam("isbn") String isbn, Model model){
    bookService.find(isbn).ifPresent(book -> model.addAttribute("book", book));
    return "books/details";
  }
}

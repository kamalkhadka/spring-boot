package com.example;

import com.example.model.Book;
import com.example.service.BookService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  public ApplicationRunner initialize(BookService bookService){
    return args -> {
      bookService.create(new Book("Hello","123", "World" ));
      bookService.create(new Book("Hello1","1231", "World1" ));
      bookService.create(new Book("Hello2","1232", "World2" ));
    };
  }

}

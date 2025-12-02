package com.joaopta.library.controller;

import com.joaopta.library.model.Book;
import com.joaopta.library.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAll() {return bookService.getAll();}

    @PostMapping
    public Book create(@RequestBody Book book) {return bookService.save(book); }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id) {bookService.delete(id);}
}

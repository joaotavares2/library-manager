package com.joaopta.library.controller;

import com.joaopta.library.model.Book;
import com.joaopta.library.repository.BookRepository;
import com.joaopta.library.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping
    public ResponseEntity<Void> createBook(@RequestBody Book book){
        bookService.createBook(book);;
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Book> findBookByTitle(@RequestParam String title){
        return ResponseEntity.ok(bookService.findBookByTitle(title));
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteBookByTitle(@RequestParam String title){
        bookService.deleteBookByTitle(title);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> updateBookById(@RequestParam Long id,
                                               @RequestBody Book book){
        bookService.updateBookById(id, book);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/all")
    public ResponseEntity<List<Book>> getAll() {
        List<Book> books = bookService.getAll();
        return ResponseEntity.ok(books);
    }
}

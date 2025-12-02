package com.joaopta.library.service;


import com.joaopta.library.model.Book;
import com.joaopta.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAll() {return bookRepository.findAll();}

    public Book save(Book book) {return bookRepository.save(book);}

    public void delete(Long id) {bookRepository.deleteById(id);}
}

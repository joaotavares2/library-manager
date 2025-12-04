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

    public void createBook(Book book){
        bookRepository.saveAndFlush(book);
    }

    public Book findBookByTitle(String title){
        return bookRepository.findByTitle(title).orElseThrow(
                () -> new RuntimeException("User not found.")
        );
    }

    public void deleteBookByTitle(String title){
        bookRepository.deleteByTitle(title);
    }

    public void updateBookById(Long id, Book book){
        Book bookEntity = bookRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Id not found.")
        );
        Book bookUpdated = Book.builder()
                .title(book.getTitle() != null ? book.getTitle() : bookEntity.getTitle())
                .author(book.getAuthor() != null ? book.getAuthor() : bookEntity.getAuthor())
                .yearPublication(book.getYearPublication() >=0 ? book.getYearPublication() : bookEntity.getYearPublication())
                .genre(book.getGenre() != null ? book.getGenre() : bookEntity.getGenre())
                .quantity(book.getQuantity() >0 ? book.getQuantity() : bookEntity.getQuantity())
                .id(bookEntity.getId())
                .build();
        bookRepository.saveAndFlush(bookUpdated);
    }




}

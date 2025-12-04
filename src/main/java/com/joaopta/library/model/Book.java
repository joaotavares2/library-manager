package com.joaopta.library.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table (name = "book")
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title", unique = true)
    private String title;

    private String author;
    private int yearPublication;
    private String genre;
    private int quantity;
}
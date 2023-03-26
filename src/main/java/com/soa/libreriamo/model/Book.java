package com.soa.libreriamo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "book")
public class Book {

    @Id
    @SequenceGenerator(name = "id_seq", sequenceName = "book_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;
    @Column(name = "title", length = 500)
    private String title;
    @Column(name = "publisher", length = 500)
    private String publisher;
    @Column(name = "year", length = 4)
    private int year;
    @Column(name = "author", length = 500)
    private String author;
    @Column(name = "isbn", length = 13, unique = true)
    private String isbn;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


}

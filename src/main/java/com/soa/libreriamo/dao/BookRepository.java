package com.soa.libreriamo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.soa.libreriamo.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	List<Book> findByTitle(String title);
    List<Book> findByAuthor(String name);
    
    @Query(value = "SELECT nextval('book_sequence')", nativeQuery = true)
    Long getNextSeriesId();
 
}
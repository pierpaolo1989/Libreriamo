package com.soa.libreriamo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.soa.libreriamo.dao.BookRepository;
import com.soa.libreriamo.model.Book;

@Service
public class BookService {
	
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public List<Book> findAll() {
		return bookRepository.findAll();
	}
	
	public void add(Book book) {
		//book.setId(bookRepository.getNextSeriesId());
		bookRepository.save(book);
	}
	
	public Book findById(Long id) {
		return bookRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid book Id:" + id));
	}
	
	public void delete(Long id) {
		Book book = this.findById(id);
		bookRepository.delete(book);
	}

}

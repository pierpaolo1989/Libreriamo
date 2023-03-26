package com.soa.libreriamo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soa.libreriamo.model.Book;
import com.soa.libreriamo.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
    
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    
    @GetMapping
    public String getBooks(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "index";
    }
    
    @GetMapping("/signup")
    public String showSignUpForm(Book book) {
        return "addBook";
    }
    
    @PostMapping("/addbook")
    public String addUser(@Valid Book user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addBook";
        }
        
        bookService.add(user);
        return "redirect:/index";
    }
    
    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Book book = bookService.findById(id);
        model.addAttribute("user", book);
        
        return "update-book";
    }
    
    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") long id, @Valid Book book, BindingResult result, Model model) {
        if (result.hasErrors()) {
            book.setId(id);
            return "update-book";
        }
        
        bookService.add(book);

        return "redirect:/index";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) {
        bookService.delete(id);
        return "redirect:/index";
    }
}
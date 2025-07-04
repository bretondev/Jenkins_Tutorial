package com.example.bookcrud.controller;

import com.example.bookcrud.model.Book;
import com.example.bookcrud.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/")
    public String listBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "books";  // maps to src/main/resources/templates/books.html
    }

    @GetMapping("/add")
    public String showAddForm(Book book) {
        return "add-book";
    }

    @PostMapping("/add")
    public String addBook(Book book) {
        bookRepository.save(book);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Book book = bookRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid book Id: " + id));
        model.addAttribute("book", book);
        return "update-book";
    }

    @PostMapping("/update/{id}")
    public String updateBook(@PathVariable("id") long id, Book book) {
        book.setId(id);
        bookRepository.save(book);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") long id) {
        Book book = bookRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid book Id: " + id));
        bookRepository.delete(book);
        return "redirect:/";
    }
}

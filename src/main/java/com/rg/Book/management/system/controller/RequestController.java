package com.rg.Book.management.system.controller;

import com.rg.Book.management.system.model.Books;
import com.rg.Book.management.system.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RequestController {
    @Autowired
    private BookService bookService;

    @PostMapping("/books")
    public ResponseEntity<String> create(@RequestBody Books books){
        System.out.println("Saving Book"+books.toString());
         Books b=bookService.create(books);
         if(b!=null){
             System.out.println("Created");
             return ResponseEntity.ok("Book Details Created Successfully");
         }
         return ResponseEntity.internalServerError().body("Failed to Create");
    }
    @GetMapping("/books")
    public ResponseEntity<?> read(){
        List<Books> books=bookService.getAll();
        return ResponseEntity.ok(books);
    }
}

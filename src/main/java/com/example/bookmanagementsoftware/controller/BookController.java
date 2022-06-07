package com.example.bookmanagementsoftware.controller;

import com.example.bookmanagementsoftware.Model.BooksModel;
import com.example.bookmanagementsoftware.Model.UserModel;
import com.example.bookmanagementsoftware.Service.BookService;
import lombok.RequiredArgsConstructor;
import org.slf4j.ILoggerFactory;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("api/v1/book")
@RequiredArgsConstructor

public class BookController {
     Logger logger= LoggerFactory.getLogger (BookController ,class)
    private final BookService bookService ;
    @GetMapping
    public ResponseEntity<List<BooksModel>> getBook() {
        List<BooksModel> books = bookService.getBook();
        return ResponseEntity.status(200).body(books);


    }

    @PostMapping("add")
    public ResponseEntity<String> addBook(@RequestBody @Valid BooksModel books) {
        bookService.addBook(books);
        logger.info("Book Add");

        return ResponseEntity.status(200).body("books added !");

    }
}

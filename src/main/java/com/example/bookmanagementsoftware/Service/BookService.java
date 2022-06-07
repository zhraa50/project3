package com.example.bookmanagementsoftware.Service;

import com.example.bookmanagementsoftware.Model.BooksModel;
import com.example.bookmanagementsoftware.Repositry.BookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service

public class BookService {
    private final BookRepo bookRepo;
    public List<BooksModel> getBook() {
        return bookRepo.findAll() ;}

    public void addBook(BooksModel books) {
         bookRepo.save(books);
    }
}

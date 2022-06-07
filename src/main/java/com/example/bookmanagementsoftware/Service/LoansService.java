package com.example.bookmanagementsoftware.Service;

import com.example.bookmanagementsoftware.Model.BooksModel;
import com.example.bookmanagementsoftware.Model.LoaneModel;
import com.example.bookmanagementsoftware.Model.UserModel;
import com.example.bookmanagementsoftware.Repositry.BookRepo;
import com.example.bookmanagementsoftware.Repositry.LonaRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service


public class LoansService
{
    private final LonaRepo lonaRepo ;
    private final UserService userService;
    private BookService bookService;
    private BookRepo bookRepo ;

    public List<LoaneModel> getLoans()
    {
        return lonaRepo.findAll();
    }

    public void LoansAdd(LoaneModel loan)
    {
         lonaRepo.save(loan);
    }

    public Integer loanBook(String userid, String bookid) {
        UserModel uid = userService.getUser(userid);
        BooksModel bid = bookService.getBook(bookid);

        if (uid == null) {
            return -1;
        }
        if (bid == null) {
            return 0;

        }
        bookRepo.delete(bid);
        return 1;
    }

}

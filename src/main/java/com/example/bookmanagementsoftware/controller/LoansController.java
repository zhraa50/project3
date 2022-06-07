package com.example.bookmanagementsoftware.controller;

import com.example.bookmanagementsoftware.DTO.API;
import com.example.bookmanagementsoftware.Model.BooksModel;
import com.example.bookmanagementsoftware.Model.LoaneModel;
import com.example.bookmanagementsoftware.Service.LoansService;
import lombok.RequiredArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("api/v1/lons")
@RequiredArgsConstructor


public class LoansController {
    Logger logger= LoggerFactory.getLogger (LoansController ,class)

    private final LoansService loansService ;
    @GetMapping
    public ResponseEntity<List<LoaneModel>> getLoans() {
        List<LoaneModel> loan = loansService.getLoans();
        return ResponseEntity.status(200).body(loan);


    }

    @PostMapping("add")
    public ResponseEntity<String> LoansAdd(@RequestBody @Valid LoaneModel loan) {
        loansService.LoansAdd(loan);
        logger.info("add loans");
        return ResponseEntity.status(200).body("loans added !");

    }


    @PutMapping("/loan")
    public ResponseEntity<API>loanBook(@RequestParam String userid, @RequestParam String bookid) {
        Integer buyStatus = loansService.loanBook(userid, bookid);

        switch (buyStatus) {
            case -1:
                return ResponseEntity.status(400).body(new API("Userid is not valid", 400));
            case 0:
                return ResponseEntity.status(400).body(new API("Bookid is not valid", 400));
            case 1:
                return ResponseEntity.status(200).body(new API("Book loans !", 200));
            default:
                return ResponseEntity.status(500).body(new API("Server error", 500));

        }
    }
}
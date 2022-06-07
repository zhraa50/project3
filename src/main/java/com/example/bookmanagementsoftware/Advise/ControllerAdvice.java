package com.example.bookmanagementsoftware.Advise;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.example.bookmanagementsoftware.Advise.ControllerAdvice InvalidIDException;


@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(InvalidIdException.class)
    public ResponseEntity handleDataIntegrity(InvalidIdException invalidIDException) {
        String message = invalidIDException.getMessage();
        return ResponseEntity.status(400).body("ERORR");
    }

}

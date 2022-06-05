package com.example.bookmanagementsoftware.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

public class LoneModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @NotEmpty(message = "not be empty")

    private String id ;


    //--------------------------------------
    @NotEmpty(message = "not be empty")

    private  String UserId ;
    //-----------------------------------
    @NotEmpty(message = "not be empty")

    private String bookID ;

}

package com.example.bookmanagementsoftware.Model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

public class LoaneModel {
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

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<BooksModel> books ;

}

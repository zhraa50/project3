package com.example.bookmanagementsoftware.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

public class BooksModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @NotEmpty(message = "not be empty")

    private String id ;


    //--------------------------------------
    @NotEmpty(message = "not be empty")

    private  String name ;
    //-----------------------------------
    @NotEmpty(message = "not be empty")

    private String genre ;

    @ManyToMany(mappedBy = books,cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<LoaneModel> loan ;



}

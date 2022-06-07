package com.example.bookmanagementsoftware.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@Data @Entity
@NoArgsConstructor

public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @NotEmpty(message = "not be empty")

    private String id ;


    //--------------------------------------
    @NotEmpty(message = "not be empty")

    private  String username ;
    //-----------------------------------
    @NotEmpty(message = "not be empty")

    private String password ;



    }


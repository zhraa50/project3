package com.example.bookmanagementsoftware.controller;


import com.example.bookmanagementsoftware.Model.UserModel;
import com.example.bookmanagementsoftware.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.logging.Logger;


@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class UserController {
     Logger logger= LoggerFactory.getLogger (UserController ,class)

    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<UserModel>> getUser() {
        List<UserModel> users = userService.getUser();
        return ResponseEntity.status(200).body(users);


    }

    @PostMapping("add")
    public ResponseEntity<String> addUser(@RequestBody @Valid UserModel users) {
        userService.addUser(users);
        logger.info("add  user");

        return ResponseEntity.status(200).body("users  added !");

    }








}

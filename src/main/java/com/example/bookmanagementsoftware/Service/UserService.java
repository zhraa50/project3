package com.example.bookmanagementsoftware.Service;

import com.example.bookmanagementsoftware.Model.UserModel;
import com.example.bookmanagementsoftware.Repositry.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;
    public List<UserModel> getUser()
    {
        return userRepo.findAll();
    }

    public void addUser(UserModel user) {
         userRepo.save(user);
    }
}

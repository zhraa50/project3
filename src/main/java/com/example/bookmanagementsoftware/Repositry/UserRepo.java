package com.example.bookmanagementsoftware.Repositry;

import com.example.bookmanagementsoftware.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepo extends JpaRepository <UserModel ,String> {

}

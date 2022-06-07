package com.example.bookmanagementsoftware.Repositry;

import com.example.bookmanagementsoftware.Model.BooksModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<BooksModel,String> {

}

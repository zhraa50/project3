package com.example.bookmanagementsoftware.Repositry;


import com.example.bookmanagementsoftware.Model.LoaneModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LonaRepo extends JpaRepository<LoaneModel,String> {

}
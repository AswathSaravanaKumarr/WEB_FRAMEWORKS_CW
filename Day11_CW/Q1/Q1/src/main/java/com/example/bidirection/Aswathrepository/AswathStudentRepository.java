package com.example.bidirection.Aswathrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.Aswathmodel.AswathStudent;



@Repository
public interface AswathStudentRepository extends JpaRepository<AswathStudent,Integer>{
    
}

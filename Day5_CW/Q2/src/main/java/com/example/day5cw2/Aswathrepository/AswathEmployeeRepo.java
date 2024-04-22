package com.example.day5cw2.Aswathrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw2.Aswathmodel.AswathEmployee;


@Repository
public interface AswathEmployeeRepo extends JpaRepository<AswathEmployee,Integer>{
    
}

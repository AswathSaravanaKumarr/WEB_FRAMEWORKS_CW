package com.example.day6cw3.Aswathrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day6cw3.Aswathmodel.AswathProduct;

@Repository
public interface AswathProductRepo extends JpaRepository<AswathProduct,Integer>{
    
}

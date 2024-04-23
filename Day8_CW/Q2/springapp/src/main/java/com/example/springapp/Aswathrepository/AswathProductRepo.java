package com.example.springapp.Aswathrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.Aswathmodel.AswathProduct;

import java.util.List;


@Repository
public interface AswathProductRepo extends JpaRepository<AswathProduct,Integer>{

    List<AswathProduct> findByProductNameStartingWith(String name);
    List<AswathProduct> findByProductNameEndingWith(String name);
    
}

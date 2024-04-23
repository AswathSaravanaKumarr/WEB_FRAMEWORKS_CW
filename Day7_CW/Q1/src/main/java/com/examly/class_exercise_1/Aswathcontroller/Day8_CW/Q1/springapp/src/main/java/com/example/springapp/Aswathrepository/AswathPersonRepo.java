package com.example.springapp.Aswathrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.Aswathmodel.AswathPerson;

import java.util.List;


@Repository
public interface AswathPersonRepo extends JpaRepository<AswathPerson,Integer>{

    List<AswathPerson> findByNameStartingWith(String name);
    List<AswathPerson> findByNameEndingWith(String name);
    
}

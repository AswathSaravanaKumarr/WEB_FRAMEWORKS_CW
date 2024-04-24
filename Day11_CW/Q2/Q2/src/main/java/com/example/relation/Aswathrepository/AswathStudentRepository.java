package com.example.relation.Aswathrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.Aswathmodel.AswathStudent;

@Repository
public interface AswathStudentRepository extends JpaRepository<AswathStudent,Integer>{
    
}

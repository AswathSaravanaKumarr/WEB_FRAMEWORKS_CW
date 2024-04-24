package com.example.relation.Aswathrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.Aswathmodel.AswathStudentInfo;

@Repository
public interface AswathStudentInfoRepository extends JpaRepository<AswathStudentInfo,Integer>{
    
}
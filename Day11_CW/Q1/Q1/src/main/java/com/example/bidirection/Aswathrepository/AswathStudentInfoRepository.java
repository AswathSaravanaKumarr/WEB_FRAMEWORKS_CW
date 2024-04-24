package com.example.bidirection.Aswathrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.Aswathmodel.AswathStudentInfo;

@Repository
public interface AswathStudentInfoRepository extends JpaRepository<AswathStudentInfo,Integer>{
    
}
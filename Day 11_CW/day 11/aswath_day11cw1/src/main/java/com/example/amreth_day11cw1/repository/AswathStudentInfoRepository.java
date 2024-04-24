package com.example.amreth_day11cw1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.amreth_day11cw1.modal.AswathStudentInfo;


@Repository
public interface AswathStudentInfoRepository extends JpaRepository<AswathStudentInfo,Integer>{
    
}
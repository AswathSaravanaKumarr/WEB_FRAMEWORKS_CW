package com.example.springapp.Aswathrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.Aswathmodel.AswathDoor;

import java.util.List;

@Repository
public interface AswathDoorRepo extends JpaRepository<AswathDoor,Integer>{

    List<AswathDoor> findByDoorId(int doorId);
    List<AswathDoor> findByAccessType(String accessType);
    
}

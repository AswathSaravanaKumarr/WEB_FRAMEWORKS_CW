package com.examly.class_exercise_1.Aswathservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.class_exercise_1.Aswathmodel.AswathPerson;
import com.examly.class_exercise_1.Aswathrepository.AswathPersonRepo;

@Service
public class AswathPersonService {

     @Autowired
     public AswathPersonRepo personRepo;

     public AswathPerson SaveEntity(AswathPerson entity) {
          return personRepo.save(entity);

     }

     public List<AswathPerson> getDetails() {
          return personRepo.findAll();

     }

     public List<AswathPerson> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}

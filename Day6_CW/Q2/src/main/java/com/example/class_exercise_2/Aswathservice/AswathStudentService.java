package com.example.class_exercise_2.Aswathservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.class_exercise_2.Aswathmodel.AswathStudent;
import com.example.class_exercise_2.Aswathrepository.AswathStudentRepo;

@Service
public class AswathStudentService {

     @Autowired
     public AswathStudentRepo studentRepo;

     public List<AswathStudent> getAll() {
          return studentRepo.findAll();
     }

     public AswathStudent post(AswathStudent student) {
          return studentRepo.save(student);
     }

     public List<AswathStudent> sortedDetails(String field) {
          return studentRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }
}

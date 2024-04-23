package com.examly.class_exercise_2.Aswathservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.class_exercise_2.Aswathmodel.AswathCourse;
import com.examly.class_exercise_2.Aswathrepository.AswathCourseRepo;

@Service
public class AswathCourseService {

     @Autowired
     public AswathCourseRepo courseRepo;

     public AswathCourse SaveEntity(AswathCourse entity) {
          return courseRepo.save(entity);

     }

     public List<AswathCourse> getDetails() {
          return courseRepo.findAll();

     }

     public List<AswathCourse> findByCourseName(String courseName) {
          return courseRepo.findByCourseName(courseName);
     }

}

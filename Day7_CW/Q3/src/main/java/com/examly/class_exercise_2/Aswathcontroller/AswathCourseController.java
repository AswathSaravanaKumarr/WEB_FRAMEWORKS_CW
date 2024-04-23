package com.examly.class_exercise_2.Aswathcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_2.Aswathmodel.AswathCourse;
import com.examly.class_exercise_2.Aswathservice.AswathCourseService;

@RestController
public class AswathCourseController {

     @Autowired
     public AswathCourseService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<AswathCourse> postMethodName(@RequestBody AswathCourse entity) {

          AswathCourse inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<AswathCourse>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<AswathCourse>> getMethodName() {

          List<AswathCourse> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<AswathCourse>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<AswathCourse>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<AswathCourse> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}
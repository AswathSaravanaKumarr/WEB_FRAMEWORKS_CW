package com.example.class_exercise_2.Aswathcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_2.Aswathmodel.AswathStudent;
import com.example.class_exercise_2.Aswathservice.AswathStudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AswathStudentController {

     @Autowired
     public AswathStudentService studentService;

     @GetMapping("/api/student")
     public ResponseEntity<List<AswathStudent>> getDetails() {
          List<AswathStudent> list = studentService.getAll();
          if (list.isEmpty()) {
               return new ResponseEntity<List<AswathStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<AswathStudent>>(list, HttpStatus.OK);

     }

     @PostMapping("/api/student")
     public ResponseEntity<AswathStudent> postMethodName(@RequestBody AswathStudent student) {

          AswathStudent postData = studentService.post(student);
          return new ResponseEntity<>(postData, HttpStatus.OK);
     }

     @GetMapping("/api/student/sort/{field}")
     public ResponseEntity<List<AswathStudent>> sortedDetails(@PathVariable String field) {
          List<AswathStudent> list = studentService.sortedDetails(field);
          if (list.isEmpty()) {
               return new ResponseEntity<List<AswathStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<AswathStudent>>(list, HttpStatus.OK);

     }
}

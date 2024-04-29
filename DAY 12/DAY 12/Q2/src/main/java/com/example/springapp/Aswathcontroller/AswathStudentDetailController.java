package com.example.springapp.Aswathcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Aswathmodel.AswathStudentDetail;
import com.example.springapp.Aswathservice.AswathStudentDetailService;

@RestController
public class AswathStudentDetailController {
    @Autowired
    AswathStudentDetailService studentDetailService;
    
    @PostMapping("/studentDetail/student/{id}")
    public ResponseEntity<AswathStudentDetail> addStudentDetails(@PathVariable int id,@RequestBody AswathStudentDetail studentDetail)
    {
       return new ResponseEntity<>(studentDetailService.addStudentDetail(id,studentDetail),HttpStatus.CREATED);
    }
    
}

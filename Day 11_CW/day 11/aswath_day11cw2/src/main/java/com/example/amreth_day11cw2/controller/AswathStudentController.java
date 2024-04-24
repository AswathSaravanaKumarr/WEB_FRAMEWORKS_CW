package com.example.amreth_day11cw2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.amreth_day11cw2.model.AswathStudent;
import com.example.amreth_day11cw2.service.StudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class AswathStudentController {
    public StudentService studentService;
    public AswathStudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public AswathStudent postMethodName(@RequestBody AswathStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<AswathStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}

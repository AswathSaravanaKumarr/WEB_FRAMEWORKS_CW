package com.example.amreth_day11cw1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.amreth_day11cw1.modal.AswathStudent;
import com.example.amreth_day11cw1.modal.AswathStudentInfo;
import com.example.amreth_day11cw1.service.AmrethStudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class AswathStudentController {
    public AmrethStudentService studentService;
    public AswathStudentController(AmrethStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public AswathStudent postMethodName(@RequestBody AswathStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public AswathStudentInfo postMethodName(@RequestBody AswathStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<AswathStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
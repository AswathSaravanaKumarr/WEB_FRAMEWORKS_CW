package com.example.bidirection.Aswathcontroller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.Aswathmodel.AswathStudent;
import com.example.bidirection.Aswathmodel.AswathStudentInfo;
import com.example.bidirection.Aswathservice.AswathStudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class AswathStudentController {
    public AswathStudentService studentService;
    public AswathStudentController(AswathStudentService studentService)
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
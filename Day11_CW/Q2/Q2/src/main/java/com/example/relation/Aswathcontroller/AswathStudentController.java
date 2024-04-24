package com.example.relation.Aswathcontroller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.Aswathmodel.AswathStudent;
import com.example.relation.service.AswathStudentService;
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
    @PostMapping("/api/student")
    public AswathStudent postMethodName(@RequestBody AswathStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<AswathStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}

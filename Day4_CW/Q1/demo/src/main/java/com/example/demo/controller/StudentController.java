package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentModel;
import com.example.demo.service.StudentService;
@RestController
@RequestMapping("/welcome")
public class StudentController 
{
    @Autowired
    public StudentService sss;
    @GetMapping("/start")
    public String wlcomeString()
    {
        return "Welcome to All";
    }

    @PostMapping("/demopost") 
    public String postdemo(@RequestBody List<StudentModel> object)
    {
        sss.Storingdata(object);
        return "yes done";
    }

    @DeleteMapping("/deletebyid/{id}")
     public void deleteAllbyid(@PathVariable("id")int id)
     {
        sss.deletebyid(id);
     }

     @PutMapping("/update")
     public int putupdate(@RequestBody List<StudentModel> stu)
     {
        return sss.updateinfo(stu);
     }
}

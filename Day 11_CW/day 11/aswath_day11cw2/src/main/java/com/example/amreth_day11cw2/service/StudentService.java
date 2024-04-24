package com.example.amreth_day11cw2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.amreth_day11cw2.model.AswathStudent;
import com.example.amreth_day11cw2.repository.AswathStudentRepository;


@Service
public class StudentService {
    public AswathStudentRepository studentRepository;
    public StudentService(AswathStudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public AswathStudent saveStudent(AswathStudent student)
    {
        return studentRepository.save(student);
    }
    public List<AswathStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}

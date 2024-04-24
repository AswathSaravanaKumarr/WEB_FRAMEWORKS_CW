package com.example.relation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relation.Aswathmodel.AswathStudent;
import com.example.relation.Aswathrepository.AswathStudentRepository;

@Service
public class AswathStudentService {
    public AswathStudentRepository studentRepository;
    public AswathStudentService(AswathStudentRepository studentRepository)
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

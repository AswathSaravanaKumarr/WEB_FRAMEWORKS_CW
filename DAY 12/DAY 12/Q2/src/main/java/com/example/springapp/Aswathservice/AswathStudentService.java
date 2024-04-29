package com.example.springapp.Aswathservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Aswathmodel.AswathStudent;
import com.example.springapp.Aswathrepository.AswathStudentRepository;

@Service
public class AswathStudentService {
    @Autowired
    AswathStudentRepository studentRepository;
    public AswathStudent addStudents(AswathStudent student)
    {
        return studentRepository.save(student);
    }
    public List<AswathStudent>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<AswathStudent>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<AswathStudent>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}

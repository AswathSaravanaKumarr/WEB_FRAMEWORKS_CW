package com.example.bidirection.Aswathservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.Aswathmodel.AswathStudent;
import com.example.bidirection.Aswathmodel.AswathStudentInfo;
import com.example.bidirection.Aswathrepository.AswathStudentInfoRepository;
import com.example.bidirection.Aswathrepository.AswathStudentRepository;

@Service
public class AswathStudentService {
    public AswathStudentRepository studentRepository;
    public AswathStudentInfoRepository studentInfoRepository;
    public AswathStudentService(AswathStudentRepository studentRepository,AswathStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public AswathStudent saveStudent(AswathStudent student)
    {
        return studentRepository.save(student);
    }
    public AswathStudentInfo saveStudentInfo(AswathStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<AswathStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}

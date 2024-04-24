package com.example.amreth_day11cw1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.amreth_day11cw1.modal.AswathStudent;
import com.example.amreth_day11cw1.modal.AswathStudentInfo;
import com.example.amreth_day11cw1.repository.AswathStudentInfoRepository;
import com.example.amreth_day11cw1.repository.AswathStudentRepository;


@Service
public class AmrethStudentService {
    public AswathStudentRepository studentRepository;
    public AswathStudentInfoRepository studentInfoRepository;
    public AmrethStudentService(AswathStudentRepository studentRepository,AswathStudentInfoRepository studentInfoRepository)
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

package com.example.springapp.Aswathservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Aswathmodel.AswathStudentDetail;
import com.example.springapp.Aswathrepository.AswathStudentDetailRepository;
import com.example.springapp.Aswathrepository.AswathStudentRepository;

@Service
public class AswathStudentDetailService {
    @Autowired
    AswathStudentDetailRepository studentDetailRepository;
    @Autowired
    AswathStudentRepository studentRepository;
    public AswathStudentDetail addStudentDetail(int id,AswathStudentDetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }
    
    
}

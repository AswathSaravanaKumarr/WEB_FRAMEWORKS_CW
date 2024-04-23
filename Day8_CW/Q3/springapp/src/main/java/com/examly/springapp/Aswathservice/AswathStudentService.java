package com.examly.springapp.Aswathservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Aswathmodel.AswathStudent;
import com.examly.springapp.Aswathrepository.AswathStudentRepo;

@Service
public class AswathStudentService {
    @Autowired
    private AswathStudentRepo studentRepo;

    public boolean post(AswathStudent student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<AswathStudent> start(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public List<AswathStudent> end(int mark) {
        return studentRepo.findByMarksLessThan(mark);
    }

}

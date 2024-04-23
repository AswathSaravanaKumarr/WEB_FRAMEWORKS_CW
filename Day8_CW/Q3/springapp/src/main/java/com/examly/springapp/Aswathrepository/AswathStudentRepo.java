package com.examly.springapp.Aswathrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Aswathmodel.AswathStudent;

import java.util.List;

@Repository
public interface AswathStudentRepo extends JpaRepository<AswathStudent, Long> {

    List<AswathStudent> findByMarksGreaterThan(int mark);

    List<AswathStudent> findByMarksLessThan(int mark);

}

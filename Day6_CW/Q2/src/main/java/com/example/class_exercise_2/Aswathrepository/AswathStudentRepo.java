package com.example.class_exercise_2.Aswathrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.class_exercise_2.Aswathmodel.AswathStudent;

@Repository
public interface AswathStudentRepo extends JpaRepository<AswathStudent, Integer> {

}
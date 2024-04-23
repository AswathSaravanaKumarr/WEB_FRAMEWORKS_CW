package com.examly.class_exercise_2.Aswathrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.class_exercise_2.Aswathmodel.AswathCourse;

@Repository
public interface AswathCourseRepo extends JpaRepository<AswathCourse, Integer> {

     List<AswathCourse> findByCourseName(String courseName);

}
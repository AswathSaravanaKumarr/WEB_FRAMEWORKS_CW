package com.examly.class_exercise_1.Aswathrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.class_exercise_1.Aswathmodel.AswathPerson;

/**
 * PersonRepo
 */
@Repository
public interface AswathPersonRepo extends JpaRepository<AswathPerson, Integer> {

     List<AswathPerson> findByAge(int byAge);
}
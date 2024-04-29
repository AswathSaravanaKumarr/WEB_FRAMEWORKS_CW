package com.example.springapp.Aswathrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springapp.Aswathmodel.AswathStudent;
@Repository
public interface AswathStudentRepository extends JpaRepository<AswathStudent,Integer>{
  
    @Query(value="select s.* from student s inner join student_detail st on s.id=st.student_id",nativeQuery = true)
    List<AswathStudent>getStudentInner();

    @Query(value="select s.* from student s left outer join student_detail st on s.id=st.student_id",nativeQuery = true)
    List<AswathStudent> getStudentsLeftOuter();

    

    
}

package com.example.q1.Aswathrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.q1.Aswathmodel.AswathAuthor;
@Repository
public interface AswathAuthorRepository extends JpaRepository<AswathAuthor, Long> {
}

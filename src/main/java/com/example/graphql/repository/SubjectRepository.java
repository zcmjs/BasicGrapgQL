package com.example.graphql.repository;

import com.example.graphql.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

}

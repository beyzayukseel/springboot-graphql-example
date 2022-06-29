package com.beyzanur.springbootgraphqlexp.repository;

import com.beyzanur.springbootgraphqlexp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student, Long> {
}

package com.beyzanur.springbootgraphqlexp.repository;

import com.beyzanur.springbootgraphqlexp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Long> {
}

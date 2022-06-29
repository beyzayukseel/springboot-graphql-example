package com.beyzanur.springbootgraphqlexp.repository;

import com.beyzanur.springbootgraphqlexp.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}

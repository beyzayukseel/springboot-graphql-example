package com.beyzanur.springbootgraphqlexp.repository;

import com.beyzanur.springbootgraphqlexp.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}

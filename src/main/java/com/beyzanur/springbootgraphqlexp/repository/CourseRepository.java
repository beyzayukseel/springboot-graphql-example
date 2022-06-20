package com.beyzanur.springbootgraphqlexp.repository;

import com.beyzanur.springbootgraphqlexp.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Long, Course> {
}

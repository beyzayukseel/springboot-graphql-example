package com.beyzanur.springbootgraphqlexp.service;

import com.beyzanur.springbootgraphqlexp.model.Course;
import com.beyzanur.springbootgraphqlexp.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public Course findCourseById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    public List<Course> findAll(){
        return courseRepository.findAll();
    }

    public void create(Course course){
        courseRepository.save(course);
    }

    public void deleteById (Long id){
        courseRepository.deleteById(id);
    }
}

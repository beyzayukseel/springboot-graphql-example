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

    public Course courseById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    public List<Course> allCourses(){
        return courseRepository.findAll();
    }

    public Course createCourse(Course course){
        return courseRepository.save(course);
    }

    public Course deleteCourse (Long id){
        courseRepository.deleteById(id);
        return courseRepository.findById(id).orElseThrow();
    }
}

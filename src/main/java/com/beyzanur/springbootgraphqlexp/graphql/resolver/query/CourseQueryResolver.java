package com.beyzanur.springbootgraphqlexp.graphql.resolver.query;

import com.beyzanur.springbootgraphqlexp.service.CourseService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class CourseQueryResolver implements GraphQLQueryResolver {

    private final CourseService courseService;

    public CourseDto getCourseById(Long id){
        return courseService.findCourseById(id);
    }

    public List<CourseDto> getAllCourses(){
        return courseService.findAll();
    }
}

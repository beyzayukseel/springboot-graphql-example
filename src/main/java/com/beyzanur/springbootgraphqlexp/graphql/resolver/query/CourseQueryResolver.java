package com.beyzanur.springbootgraphqlexp.graphql.resolver.query;

import com.beyzanur.springbootgraphqlexp.dto.CourseDto;
import com.beyzanur.springbootgraphqlexp.model.Course;
import com.beyzanur.springbootgraphqlexp.service.CourseService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@RequiredArgsConstructor
@Component
public class CourseQueryResolver implements GraphQLQueryResolver {

    private final CourseService courseService;

    public Course courseById(Long id){
        return courseService.courseById(id);
    }

    public List<Course> allCourses(){
        return courseService.allCourses();
    }
}

package com.beyzanur.springbootgraphqlexp.graphql.resolver.mutation;

import com.beyzanur.springbootgraphqlexp.dto.CourseDto;
import com.beyzanur.springbootgraphqlexp.model.Course;
import com.beyzanur.springbootgraphqlexp.service.CourseService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CourseMutation implements GraphQLMutationResolver {

    private final CourseService courseService;

    public Course createCourse(Course course){
         return courseService.createCourse(course);
    }

    public Course deleteCourse(Long id){
        return courseService.deleteCourse(id);
    }
}

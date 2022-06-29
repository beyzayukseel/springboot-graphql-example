package com.beyzanur.springbootgraphqlexp.graphql.resolver.mutation;

import com.beyzanur.springbootgraphqlexp.model.Course;
import com.beyzanur.springbootgraphqlexp.service.CourseService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CourseMutation implements GraphQLMutationResolver {

    private final CourseService courseService;

    public Course create(CourseDto courseDto){
        return courseService.create(courseDto);
    }

    public void delete(Long id){
        courseService.deleteById(id);
    }
}

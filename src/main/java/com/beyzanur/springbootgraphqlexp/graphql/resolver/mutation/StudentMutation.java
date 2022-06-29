package com.beyzanur.springbootgraphqlexp.graphql.resolver.mutation;

import com.beyzanur.springbootgraphqlexp.model.Student;
import com.beyzanur.springbootgraphqlexp.service.StudentService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class StudentMutation implements GraphQLMutationResolver {

    private final StudentService studentService;

    public Student createStudent(Student student){
        return studentService.createStudent(student);
    }

    public Student deleteStudent(Long id){
        return studentService.deleteStudent(id);
    }
}

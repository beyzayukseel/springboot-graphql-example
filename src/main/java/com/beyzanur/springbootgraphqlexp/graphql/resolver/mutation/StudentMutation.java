package com.beyzanur.springbootgraphqlexp.graphql.resolver.mutation;

import com.beyzanur.springbootgraphqlexp.model.Student;
import com.beyzanur.springbootgraphqlexp.service.StudentService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class StudentMutation implements GraphQLMutationResolver {

    private final StudentService studentService;

    public Student create(StudentDto studentDto){
        return studentService.create(studentDto);
    }

    public void delete(Long id){
        studentService.deleteById(id);
    }
}

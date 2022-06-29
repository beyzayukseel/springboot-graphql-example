package com.beyzanur.springbootgraphqlexp.graphql.resolver.query;

import com.beyzanur.springbootgraphqlexp.model.Student;
import com.beyzanur.springbootgraphqlexp.service.StudentService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class StudentQueryResolver implements GraphQLQueryResolver {

    private final StudentService studentService;

    public Student studentById(Long id){
        return studentService.studentById(id);
    }

    public List<Student> allStudents(){
        return studentService.allStudents();
    }
}

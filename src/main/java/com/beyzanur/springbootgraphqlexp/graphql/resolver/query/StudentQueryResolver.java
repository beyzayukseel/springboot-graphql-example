package com.beyzanur.springbootgraphqlexp.graphql.resolver.query;

import com.beyzanur.springbootgraphqlexp.dto.StudentDto;
import com.beyzanur.springbootgraphqlexp.service.StudentService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class StudentQueryResolver implements GraphQLQueryResolver {

    private final StudentService studentService;

    public StudentDto getStudentById(Long id){
        return studentService.findStudentById(id);
    }

    public List<StudentDto> getAllStudents(){
        return studentService.findAll();
    }
}

package com.beyzanur.springbootgraphqlexp.graphql.resolver.query;

import com.beyzanur.springbootgraphqlexp.dto.InstructorDto;
import com.beyzanur.springbootgraphqlexp.service.InstructorService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class InstructorQueryResolver implements GraphQLQueryResolver {

    private final InstructorService instructorService;

    public InstructorDto getStudentById(Long id){
        return instructorService.findInstructorById(id);
    }

    public List<InstructorDto> getAllInstructors(){
        return instructorService.findAll();
    }
}

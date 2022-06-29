package com.beyzanur.springbootgraphqlexp.graphql.resolver.query;

import com.beyzanur.springbootgraphqlexp.dto.InstructorDto;
import com.beyzanur.springbootgraphqlexp.model.Instructor;
import com.beyzanur.springbootgraphqlexp.service.InstructorService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class InstructorQueryResolver implements GraphQLQueryResolver {

    private final InstructorService instructorService;

    public Instructor instructorById(Long id){
        return instructorService.instructorById(id);
    }

    public List<Instructor> allInstructors(){
        return instructorService.allInstructors();
    }
}

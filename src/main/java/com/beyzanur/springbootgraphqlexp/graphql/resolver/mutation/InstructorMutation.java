package com.beyzanur.springbootgraphqlexp.graphql.resolver.mutation;

import com.beyzanur.springbootgraphqlexp.model.Instructor;
import com.beyzanur.springbootgraphqlexp.service.InstructorService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class InstructorMutation implements GraphQLMutationResolver {

    private final InstructorService instructorService;

    public Instructor create(InstructorDto instructorDto){
        return instructorService.create(instructorDto);
    }

    public void delete(Long id){
        instructorService.deleteById(id);
    }
}

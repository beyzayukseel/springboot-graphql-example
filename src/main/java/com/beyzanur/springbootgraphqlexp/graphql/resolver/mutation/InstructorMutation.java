package com.beyzanur.springbootgraphqlexp.graphql.resolver.mutation;

import com.beyzanur.springbootgraphqlexp.model.Instructor;
import com.beyzanur.springbootgraphqlexp.service.InstructorService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class InstructorMutation implements GraphQLMutationResolver {

    private final InstructorService instructorService;

    public Instructor createInstructor(Instructor instructor){
         return instructorService.createInstructor(instructor);
    }

    public Instructor deleteInstructor(Long id){
        return instructorService.deleteInstructor(id);
    }
}

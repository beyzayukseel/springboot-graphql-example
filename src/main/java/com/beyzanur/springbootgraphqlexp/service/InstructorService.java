package com.beyzanur.springbootgraphqlexp.service;

import com.beyzanur.springbootgraphqlexp.model.Instructor;
import com.beyzanur.springbootgraphqlexp.repository.InstructorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class InstructorService {

    private final InstructorRepository instructorRepository;

    public Instructor instructorById(Long id) {
        return instructorRepository.findById(id).orElseThrow();
    }

    public List<Instructor> allInstructors(){
        return instructorRepository.findAll();
    }

    public Instructor createInstructor(Instructor instructor){
        return instructorRepository.save(instructor);
    }

    public Instructor deleteInstructor (Long id){
        instructorRepository.deleteById(id);
        return instructorRepository.getById(id);
    }
}


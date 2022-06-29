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

    public Instructor findInstructorById(Long id) {
        return instructorRepository.findById(id).orElseThrow();
    }

    public List<Instructor> findAll(){
        return instructorRepository.findAll();
    }

    public void create(Instructor instructor){
        instructorRepository.save(instructor);
    }

    public void deleteById (Long id){
        instructorRepository.deleteById(id);
    }
}


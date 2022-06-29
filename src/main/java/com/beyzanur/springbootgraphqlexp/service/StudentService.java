package com.beyzanur.springbootgraphqlexp.service;
import com.beyzanur.springbootgraphqlexp.model.Student;
import com.beyzanur.springbootgraphqlexp.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public Student findStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public void create(Student student){
        studentRepository.save(student);
    }

    public void deleteById (Long id){
        studentRepository.deleteById(id);
    }
}

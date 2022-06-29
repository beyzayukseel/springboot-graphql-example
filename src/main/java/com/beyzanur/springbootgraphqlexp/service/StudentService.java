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

    public Student studentById(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    public List<Student> allStudents(){
        return studentRepository.findAll();
    }

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    public Student deleteStudent (Long id){
         studentRepository.deleteById(id);
         return studentRepository.findById(id).orElseThrow();
    }
}

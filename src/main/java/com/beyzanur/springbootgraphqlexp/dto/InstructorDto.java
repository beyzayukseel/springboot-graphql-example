package com.beyzanur.springbootgraphqlexp.dto;

import com.beyzanur.springbootgraphqlexp.model.InstructorType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.OneToMany;
import java.util.Set;

@Getter
@Setter
public class InstructorDto {

    private String name;
    private String address;
    private String phoneNumber;
    private InstructorType instructorType;

    @OneToMany
    private Set<CourseDto> courseDto;
}

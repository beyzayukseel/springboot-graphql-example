package com.beyzanur.springbootgraphqlexp.dto;
import com.beyzanur.springbootgraphqlexp.model.Gender;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
public class StudentDto {

    private String name;
    private String surname;
    private Date birthday;
    private Gender gender;

    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private Set<CourseDto> courseDto;
}

package com.beyzanur.springbootgraphqlexp.dto;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Getter
@Setter
public class CourseDto {

    private String name;
    private String code;
    private BigDecimal creditScore;
    @ManyToOne
    private InstructorDto instructorDto;
}

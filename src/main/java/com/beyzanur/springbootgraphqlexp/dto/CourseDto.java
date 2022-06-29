package com.beyzanur.springbootgraphqlexp.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.ManyToOne;
import java.math.BigDecimal;


@Getter
@Setter
public class CourseDto {

    private Long id;
    private String name;
    private String code;
    private BigDecimal creditScore;

    @ManyToOne
    private InstructorDto instructorDto;
}

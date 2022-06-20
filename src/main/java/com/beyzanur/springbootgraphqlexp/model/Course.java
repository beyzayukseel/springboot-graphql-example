package com.beyzanur.springbootgraphqlexp.model;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.math.BigDecimal;

@Setter
@Getter
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    private BigDecimal creditScore;

    @ManyToOne
    private Instructor instructor;
}

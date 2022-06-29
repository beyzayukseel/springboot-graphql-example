package com.beyzanur.springbootgraphqlexp.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;



@Setter
@Getter
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    private Integer creditScore;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Instructor instructor;
}

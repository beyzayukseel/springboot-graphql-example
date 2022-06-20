package com.beyzanur.springbootgraphqlexp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Setter
@Getter
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private LocalDate birthday;
    private Gender gender;

    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private Set<Course> courses;
}

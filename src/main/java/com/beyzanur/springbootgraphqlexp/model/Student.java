package com.beyzanur.springbootgraphqlexp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
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
    private String birthday;
    private Gender gender;

    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private Set<Course> courses;
}

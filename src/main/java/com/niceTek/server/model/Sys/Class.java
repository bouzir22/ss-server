package com.niceTek.server.model.Sys;

import com.niceTek.server.model.RH.Student;
import com.niceTek.server.model.RH.Teacher;

import javax.persistence.*;
import java.util.List;

@Entity
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name;
    String level;
    @ManyToOne
    private Teacher teacher;
    @OneToMany(mappedBy = "stClass")
    private List<Student> students;
}

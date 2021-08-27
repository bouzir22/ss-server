package com.niceTek.server.model.Sys;

import com.niceTek.server.model.RH.Student;
import com.niceTek.server.model.RH.Teacher;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
public class Class {
    public Class(String name, String level) {
        this.name = name;
        this.level = level;
    }

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

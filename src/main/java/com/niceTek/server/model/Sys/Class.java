package com.niceTek.server.model.Sys;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.niceTek.server.model.RH.Student;
import com.niceTek.server.model.RH.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
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
    /*@OneToMany
    private List<class_teacher> class_teachers;*/
    @OneToMany(mappedBy = "stClass")
    @JsonIgnore
    private List<Student> students;
    @OneToMany(mappedBy = "aClass")
    private  List<class_course> class_courses;


    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +

                ", class_courses=" + class_courses +
                '}';
    }
}

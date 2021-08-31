package com.niceTek.server.model.Sys;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name;

    public Course(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "course")
    private List<Material> materials;

    @OneToMany(mappedBy = "course")
    private List<class_course> class_courses;
}

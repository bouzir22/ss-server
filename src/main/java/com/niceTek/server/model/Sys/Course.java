package com.niceTek.server.model.Sys;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name;
    @OneToMany(mappedBy = "course")
    private List<Material> materials;
}

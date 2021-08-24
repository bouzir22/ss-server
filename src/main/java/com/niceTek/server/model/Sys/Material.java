package com.niceTek.server.model.Sys;

import javax.persistence.*;

@Entity
public class Material {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
@ManyToOne
    private Course course;
}

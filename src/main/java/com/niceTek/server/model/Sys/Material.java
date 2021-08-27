package com.niceTek.server.model.Sys;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Material {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;

    public Material(String name) {
        this.name = name;
    }

    @ManyToOne
    private Course course;
}

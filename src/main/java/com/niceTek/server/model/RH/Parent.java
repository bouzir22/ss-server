package com.niceTek.server.model.RH;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Parent extends User {
    @OneToMany(mappedBy = "parent")
    private List<Student> students;

}

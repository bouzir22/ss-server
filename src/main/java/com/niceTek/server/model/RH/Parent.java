package com.niceTek.server.model.RH;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Parent extends User {
    @OneToMany(mappedBy = "parent")
    private List<Student> students;

}

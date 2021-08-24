package com.niceTek.server.model.RH;

import com.niceTek.server.model.Sys.Class;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Teacher extends User {
     @OneToMany(mappedBy = "teacher")
    private List<Class>classes;
}

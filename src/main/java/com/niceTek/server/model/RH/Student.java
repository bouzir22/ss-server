package com.niceTek.server.model.RH;

import com.niceTek.server.model.Sys.Class;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Student extends User {
    @ManyToOne
    private Parent parent;
    @ManyToOne
    private Class stClass;
}

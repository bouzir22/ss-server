package com.niceTek.server.model.RH;

import com.niceTek.server.model.Sys.Class;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Student extends User {
    @ManyToOne
    private Parent parent;
    @ManyToOne
    private Class stClass;
}

package com.niceTek.server.model.RH;

import com.niceTek.server.model.Role;
import com.niceTek.server.model.Sys.Class;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student extends User {

    public Student(String firstName, String lastName, String username, String password, Role role) {
        super(firstName, lastName, username, password, role);
    }

    @ManyToOne
    private Parent parent;
    @ManyToOne
    private Class stClass;
}

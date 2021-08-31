package com.niceTek.server.model.RH;

import com.niceTek.server.model.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Parent extends User {
    public Parent(String firstName, String lastName, String username, String password, Role role) {
        super(firstName, lastName, username, password, role);
    }

    @OneToMany(mappedBy = "parent",fetch = FetchType.EAGER)
    private List<Student> students;





}

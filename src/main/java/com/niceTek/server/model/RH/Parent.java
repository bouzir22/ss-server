package com.niceTek.server.model.RH;

import com.niceTek.server.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Parent extends User {
    public Parent(String firstName, String lastName, String username, String password, Role role) {
        super(firstName, lastName, username, password, role);
    }

    @OneToMany(mappedBy = "parent")
    private List<Student> students;

}

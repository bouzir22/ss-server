package com.niceTek.server.model.RH;

import com.niceTek.server.model.Role;
import com.niceTek.server.model.Sys.Class;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Teacher extends User {
    public Teacher(String firstName, String lastName, String username, String password, Role role) {
        super(firstName, lastName, username, password, role);
    }

    @OneToMany(mappedBy = "teacher")
    private List<Class>classes;
}

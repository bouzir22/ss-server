package com.niceTek.server.model.RH;

import com.niceTek.server.model.Role;
import com.niceTek.server.model.Sys.Class;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Teacher extends User {
    public Teacher(String firstName, String lastName, String username, String password, Role role) {
        super(firstName, lastName, username, password, role);
    }

    @ManyToMany
    private List<Class>classes;
}

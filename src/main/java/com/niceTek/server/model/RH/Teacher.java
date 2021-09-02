package com.niceTek.server.model.RH;

import com.niceTek.server.model.Role;
import com.niceTek.server.model.Sys.Class;
import com.niceTek.server.model.Sys.class_teacher;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
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
    /*@OneToMany
    private List<class_teacher> class_teachers;*/



    @Override
    public String toString() {
        return "Teacher{" +
                "classes=" + classes +
                '}';
    }
}

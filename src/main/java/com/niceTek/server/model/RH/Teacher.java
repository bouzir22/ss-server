package com.niceTek.server.model.RH;

import com.niceTek.server.model.Sys.Class;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Teacher extends User {
     @OneToMany(mappedBy = "teacher")
    private List<Class>classes;
}

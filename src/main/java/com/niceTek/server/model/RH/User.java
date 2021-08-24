package com.niceTek.server.model.RH;

import com.niceTek.server.model.Role;


import javax.persistence.*;
import java.io.Serializable;
@MappedSuperclass
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String firstName;
    protected String lastName;
    protected String username ;
    protected String password;
    protected Role role;

}

package com.niceTek.server.model.RH;

import com.niceTek.server.model.Role;

import javax.persistence.*;
import java.io.Serializable;
@MappedSuperclass
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String username ;
    private String password;
    private Role role;

}

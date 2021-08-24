package com.niceTek.server.model.Sys;

import com.niceTek.server.model.RH.Student;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Exam {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private LocalDateTime date;
private double mark;
@ManyToOne
    private Course course;
@ManyToOne
    private Student student;
}

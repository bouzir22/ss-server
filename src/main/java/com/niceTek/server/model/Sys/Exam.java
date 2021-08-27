package com.niceTek.server.model.Sys;

import com.niceTek.server.model.RH.Student;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
public class Exam {
    public Exam(LocalDateTime date, double mark) {
        this.date = date;
        this.mark = mark;
    }

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

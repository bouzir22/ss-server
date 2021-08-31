package com.niceTek.server.controller;

import com.niceTek.server.model.RH.Student;
import com.niceTek.server.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class StudentController {
@Autowired
    StudentRepo studentRepo;
@GetMapping("/allStudents")
public List<Student> getAll()
{return this.studentRepo.findAll();}
}

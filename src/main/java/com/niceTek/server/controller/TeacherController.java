package com.niceTek.server.controller;
import com.niceTek.server.model.RH.Teacher;
import com.niceTek.server.repo.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherRepo teacherRepo;

    @GetMapping("/allteachers")
    private  List<Teacher> getAll(){
     return    this.teacherRepo.findAll();
    }

}

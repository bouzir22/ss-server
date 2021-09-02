package com.niceTek.server.controller;

import com.niceTek.server.model.RH.Student;
import com.niceTek.server.model.Sys.Class;
import com.niceTek.server.repo.ClassRepo;
import com.niceTek.server.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class StudentController {
@Autowired
    StudentRepo studentRepo;
@Autowired
    ClassRepo classRepo;
@GetMapping("/allStudents")
public List<Student> getAll()
{return this.studentRepo.findAll();}



    @PostMapping("saveStudent/{id}")
    public void saveStudent(@PathVariable Long id, @RequestBody Student student){
        Class aClass = this.classRepo.findById(id).get();
    student.setStClass(aClass);
    this.studentRepo.save(student);




    }

    @GetMapping("byParent/{id}")
    List<Student> studentsByparent(@PathVariable Long id){return this.studentRepo.findByParentId(id);}






}


package com.niceTek.server.controller;

import com.niceTek.server.model.Sys.Class;
import com.niceTek.server.repo.ClassRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClassController {

@Autowired
    private ClassRepo classRepo;
@GetMapping("allClasses")
public List<Class> getAll(){return this.classRepo.findAll();}
}

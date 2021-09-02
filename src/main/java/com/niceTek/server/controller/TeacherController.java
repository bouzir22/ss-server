package com.niceTek.server.controller;
import com.niceTek.server.model.RH.Teacher;
import com.niceTek.server.model.Sys.Class;
import com.niceTek.server.repo.ClassRepo;
import com.niceTek.server.repo.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {  Teacher teacher;

    @Autowired
    private TeacherRepo teacherRepo;
     @Autowired
     private ClassRepo classRepo;
    @GetMapping("/allteachers")
    private  List<Teacher> getAll(){
     return    this.teacherRepo.findAll();
    }

    @PostMapping("tempTeacher")
    public void save(@RequestBody Teacher teacher)
    {
        this.teacher = teacher ;
    }


    @PostMapping("setClasses")
    public void save(@RequestBody List<Long> ids)
    { List<Class> classes=this.classRepo.findAllById(ids);    //System.out.println(classes.size());



this.teacher.setClasses(classes);

        this.teacherRepo.save(teacher);


    }
}

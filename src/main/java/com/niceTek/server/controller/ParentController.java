package com.niceTek.server.controller;

import com.niceTek.server.model.RH.Parent;
import com.niceTek.server.repo.ParentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParentController {
   @Autowired
   private ParentRepo parentRepo;
    @RequestMapping("/allparents")

    public List<Parent> getAll ()
    {List<Parent> parents = this.parentRepo.findAll();;
    for (Parent p : parents){
        System.out.println(p);
    }
    return  parents;}

}


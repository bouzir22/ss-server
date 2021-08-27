package com.niceTek.server.repo;

import com.niceTek.server.model.RH.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface TeacherRepo  extends JpaRepository<Teacher,Long> {

}

package com.niceTek.server.repo;

import com.niceTek.server.model.Sys.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface ActivityRepo extends JpaRepository<Activity,Long> {
}

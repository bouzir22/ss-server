package com.niceTek.server.repo;


import com.niceTek.server.model.Sys.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface MaterialRepo extends JpaRepository<Material,Long> {
}

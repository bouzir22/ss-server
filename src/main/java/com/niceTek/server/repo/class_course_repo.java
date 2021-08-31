package com.niceTek.server.repo;

import com.niceTek.server.model.Sys.class_course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface class_course_repo extends JpaRepository<class_course,Long> {
}

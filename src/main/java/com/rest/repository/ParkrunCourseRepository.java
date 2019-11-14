package com.rest.repository;

import com.rest.model.ParkrunCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "courses",
        path = "courses")
public interface ParkrunCourseRepository extends JpaRepository<ParkrunCourse, Long> {
}

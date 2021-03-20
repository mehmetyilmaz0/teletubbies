package com.mehmetyilmaz.teletubbies.repository;

import com.mehmetyilmaz.teletubbies.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    List<Project> getAllByProjectNameNotNull ();

    List<Project> findAll (Sort sort);

}

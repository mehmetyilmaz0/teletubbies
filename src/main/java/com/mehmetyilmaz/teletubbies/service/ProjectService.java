package com.mehmetyilmaz.teletubbies.service;

import com.mehmetyilmaz.teletubbies.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProjectService {

    Project save (Project project);

    Project getById(Long id);

    Page<Project> getAllPagination (Pageable pageable);

}

package com.mehmetyilmaz.teletubbies.service.impl;

import com.mehmetyilmaz.teletubbies.entity.Project;
import com.mehmetyilmaz.teletubbies.repository.ProjectRepository;
import com.mehmetyilmaz.teletubbies.service.ProjectService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Project getById(Long id) {
        return projectRepository.getOne(id);
    }

    @Override
    public Page<Project> getAllPagination(Pageable pageable) {
        return projectRepository.findAll(pageable);
    }
}

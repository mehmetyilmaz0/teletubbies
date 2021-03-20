package com.mehmetyilmaz.teletubbies.service.impl;

import com.mehmetyilmaz.teletubbies.entity.Project;
import com.mehmetyilmaz.teletubbies.repository.ProjectRepository;
import com.mehmetyilmaz.teletubbies.service.ProjectService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Project save(Project project) {

        if (project.getProjectCode() == null)
            throw new IllegalArgumentException("Project code can not be null!!");

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

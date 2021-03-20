package com.mehmetyilmaz.teletubbies.service.impl;

import com.mehmetyilmaz.teletubbies.entity.Issue;
import com.mehmetyilmaz.teletubbies.repository.IssueRepository;
import com.mehmetyilmaz.teletubbies.service.IssueService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class IssueServiceImpl implements IssueService {

    private final IssueRepository issueRepository;

    public IssueServiceImpl(IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }

    @Override
    public Issue save(Issue issue) {
        return issueRepository.save(issue);
    }

    @Override
    public Issue getById(Long id) {
        return issueRepository.getOne(id);
    }

    @Override
    public Page<Issue> getAllPagination(Pageable pageable) {
        return issueRepository.findAll(pageable);
    }
}

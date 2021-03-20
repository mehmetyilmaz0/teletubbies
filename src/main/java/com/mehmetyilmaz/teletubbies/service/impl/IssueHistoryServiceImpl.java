package com.mehmetyilmaz.teletubbies.service.impl;

import com.mehmetyilmaz.teletubbies.entity.IssueHistory;
import com.mehmetyilmaz.teletubbies.repository.IssueHistoryRepository;
import com.mehmetyilmaz.teletubbies.service.IssueHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class IssueHistoryServiceImpl implements IssueHistoryService {

    private final IssueHistoryRepository issueHistoryRepository;

    public IssueHistoryServiceImpl (IssueHistoryRepository issueHistoryRepository) {
        this.issueHistoryRepository = issueHistoryRepository;
    }

    @Override
    public IssueHistory save(IssueHistory issueHistory) {
        return issueHistoryRepository.save(issueHistory);
    }

    @Override
    public IssueHistory getById(Long id) {
        return issueHistoryRepository.getOne(id);
    }

    @Override
    public Page<IssueHistory> getAllPagination(Pageable pageable) {
        return issueHistoryRepository.findAll(pageable);
    }
}

package com.mehmetyilmaz.teletubbies.service;

import com.mehmetyilmaz.teletubbies.entity.IssueHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueHistoryService {

    IssueHistory save (IssueHistory issueHistory);

    IssueHistory getById(Long id);

    Page<IssueHistory> getAllPagination (Pageable pageable);

}

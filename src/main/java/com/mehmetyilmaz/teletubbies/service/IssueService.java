package com.mehmetyilmaz.teletubbies.service;

import com.mehmetyilmaz.teletubbies.entity.Issue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {

    Issue save (Issue issue);

    Issue getById(Long id);

    Page<Issue> getAllPagination (Pageable pageable);

}

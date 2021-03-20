package com.mehmetyilmaz.teletubbies.service;

import com.mehmetyilmaz.teletubbies.dto.IssueDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {

    IssueDto save (IssueDto issue);

    IssueDto getById(Long id);

    Page<IssueDto> getAllPagination (Pageable pageable);

}

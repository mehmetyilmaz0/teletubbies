package com.mehmetyilmaz.teletubbies.service;

import com.mehmetyilmaz.teletubbies.dto.IssueDto;
import com.mehmetyilmaz.teletubbies.util.TPage;
import org.springframework.data.domain.Pageable;

public interface IssueService {

    IssueDto save (IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPagination (Pageable pageable);

}

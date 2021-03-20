package com.mehmetyilmaz.teletubbies.service.impl;

import com.mehmetyilmaz.teletubbies.dto.IssueDto;
import com.mehmetyilmaz.teletubbies.entity.Issue;
import com.mehmetyilmaz.teletubbies.repository.IssueRepository;
import com.mehmetyilmaz.teletubbies.service.IssueService;
import com.mehmetyilmaz.teletubbies.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class IssueServiceImpl implements IssueService {

    private final IssueRepository issueRepository;
    private final ModelMapper modelMapper;

    public IssueServiceImpl(IssueRepository issueRepository, ModelMapper modelMapper) {
        this.issueRepository = issueRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public IssueDto save(IssueDto issueDto) {

        if (issueDto.getDate() == null)
            throw new IllegalArgumentException("Issue Date can not be null!");

        Issue dataIssue = modelMapper.map(issueDto, Issue.class);
        dataIssue = issueRepository.save(dataIssue);

        return modelMapper.map(dataIssue, IssueDto.class);
    }

    @Override
    public IssueDto getById(Long id) {
        return null;
    }

    @Override
    public TPage<IssueDto> getAllPagination(Pageable pageable) {

        Page<Issue> dataIssue = issueRepository.findAll(pageable);
        IssueDto[] dataIssueDto = modelMapper.map(dataIssue.getContent(), IssueDto[].class);

        TPage tPage = new TPage<IssueDto>();
        tPage.setStat(dataIssue, Arrays.asList(dataIssueDto));

        return tPage;
    }
}

package com.mehmetyilmaz.teletubbies.dto;

import com.mehmetyilmaz.teletubbies.entity.IssueStatus;
import com.mehmetyilmaz.teletubbies.entity.Project;
import com.mehmetyilmaz.teletubbies.entity.User;
import lombok.Data;

import java.util.Date;

@Data
public class IssueDto {
    private Long id;
    private String description;
    private String details;
    private Date date;
    private IssueStatus issueStatus;
    private UserDto assignee;
    private ProjectDto project;
}

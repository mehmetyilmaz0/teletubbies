package com.mehmetyilmaz.teletubbies.repository;

import com.mehmetyilmaz.teletubbies.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Long> {
}

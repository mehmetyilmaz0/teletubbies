package com.mehmetyilmaz.teletubbies.repository;

import com.mehmetyilmaz.teletubbies.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long> {
}

package com.example.employeeservice.repositories;

import com.example.employeeservice.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}

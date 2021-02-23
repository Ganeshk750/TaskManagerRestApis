package com.ganesh.apis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.apis.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}

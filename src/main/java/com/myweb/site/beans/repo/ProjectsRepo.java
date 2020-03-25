package com.myweb.site.beans.repo;

import org.springframework.data.repository.CrudRepository;

import com.myweb.site.beans.Projects;

public interface ProjectsRepo extends CrudRepository<Projects, Integer> {

}

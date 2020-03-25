package com.myweb.site.beans.repo;

import org.springframework.data.repository.CrudRepository;

import com.myweb.site.beans.Visitor;

public interface VisitorRepo extends CrudRepository<Visitor, Integer> {

}

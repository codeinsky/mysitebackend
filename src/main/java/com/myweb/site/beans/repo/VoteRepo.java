package com.myweb.site.beans.repo;

import org.springframework.data.repository.CrudRepository;

import com.myweb.site.beans.Vote;


public interface VoteRepo extends CrudRepository<Vote, Integer> {

}

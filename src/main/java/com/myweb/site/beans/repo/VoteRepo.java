package com.myweb.site.beans.repo;

import org.springframework.data.repository.CrudRepository;

import com.myweb.site.beans.Vote;


public interface VoteRepo extends CrudRepository<Vote, Integer> {
	Iterable<Vote> findVoteByLiked (boolean liked);
	Iterable<Vote> findVoteByDisliked (boolean liked);

}

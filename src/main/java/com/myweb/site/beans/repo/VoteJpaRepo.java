package com.myweb.site.beans.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.myweb.site.beans.Vote;



public interface VoteJpaRepo extends JpaRepository<Vote, Integer> {
	
	@Query("FROM VOTE WHERE liked = ?1")
	List<Vote> findByLiked(Boolean liked);

}

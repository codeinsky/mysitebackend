package com.myweb.site.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myweb.site.beans.repo.AboutMeRepo;
import com.myweb.site.beans.repo.ProjectsRepo;
import com.myweb.site.beans.repo.VisitorRepo;
import com.myweb.site.beans.repo.VoteRepo;

@Service 
public class MySiteDoa {
	
	@Autowired
	AboutMeRepo abouteMeRepo;
	
	@Autowired
	ProjectsRepo projectsRepo;
	
	@Autowired 
	VisitorRepo visitoreRepo;
	
	
	@Autowired 
	VoteRepo voreRpo;
	
	public void Vote() {
		
	}
	

}

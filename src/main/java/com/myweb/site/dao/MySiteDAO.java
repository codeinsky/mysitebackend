package com.myweb.site.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myweb.site.beans.repo.AboutMeRepo;
import com.myweb.site.beans.repo.ProjectsRepo;
import com.myweb.site.beans.repo.VisitorRepo;
import com.myweb.site.beans.repo.VoteRepo;
import com.myweb.site.beans.*;

@Service 
public class MySiteDAO {
	
	@Autowired
	AboutMeRepo aboutMeRepo;
	
	@Autowired
	ProjectsRepo projectsRepo;
	
	@Autowired 
	VisitorRepo visitorRepo;
	
	
	@Autowired 
	VoteRepo voteRepo;
	
	public  void vote(Vote vote) {
		voteRepo.save(vote);
		
		
	}
	
	public  void visitor(Visitor visitor) {
		visitorRepo.save(visitor);
		
	}
	
	public  void setProject(Projects project) {
		
		projectsRepo.save(project);
	}
	
	public Iterable<Projects> getAllProjects(){
		Iterable<Projects> allProjects;
		allProjects = projectsRepo.findAll();
		return allProjects;
	}
	
	public void deleteProject(Integer id) {

		projectsRepo.deleteById(id);
	}
	
	public void addAboutMeSection(AboutMe aboutMe) {
		
		aboutMeRepo.save(aboutMe);
	}

	public Iterable<AboutMe> getAllAboutMe(){
		Iterable<AboutMe> aboutMe;
		aboutMe= aboutMeRepo.findAll();
		return aboutMe;
	}

	public void deleteAboutMeSection(Integer id) {
		aboutMeRepo.deleteById(id);
	}
}

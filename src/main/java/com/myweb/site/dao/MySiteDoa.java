package com.myweb.site.dao;
import java.sql.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myweb.site.beans.repo.AboutMeRepo;
import com.myweb.site.beans.repo.ProjectsRepo;
import com.myweb.site.beans.repo.VisitorRepo;
import com.myweb.site.beans.repo.VoteRepo;
import com.myweb.site.beans.*;

@Service 
public class MySiteDoa {
	
	@Autowired
	AboutMeRepo aboutMeRepo;
	
	@Autowired
	ProjectsRepo projectsRepo;
	
	@Autowired 
	VisitorRepo visitorRepo;
	
	
	@Autowired 
	VoteRepo voteRepo;
	
	public  void vote(int id, Date date, boolean like, boolean dislike, String comment) {
		Vote newVote = new Vote();
		newVote.setComment(comment);
		newVote.setDate(date);
		newVote.setId(id);
		newVote.setDislike(dislike);
		newVote.setLike(like);
		voteRepo.save(newVote);
		
		
	}
	
	public  void visitor(int id, Date date, String ip, String comment) {
		Visitor newVisitor = new Visitor();
		newVisitor.setId(id);
		newVisitor.setComment(comment);
		newVisitor.setDate(date);
		newVisitor.setIp(ip);
		visitorRepo.save(newVisitor);
		
	}
	
	public  void setProject(int id, String comment, String links, String name, String system) {
		Projects newProject = new Projects();
		newProject.setComment(comment);
		newProject.setId(id);
		newProject.setLinks(links);
		newProject.setName(name);
		newProject.setSystem(system);
		projectsRepo.save(newProject);
	}
	
	public Iterable<Projects> getAllProjects(){
		Iterable<Projects> allProjects;
		allProjects = projectsRepo.findAll();
		return allProjects;
	}
	
	public void deleteProject(Integer id) {

		projectsRepo.deleteById(id);
	}
	
	public void addAboutMeSection(Integer id, String section, String details, String comment) {
		AboutMe aboutMe = new AboutMe();
		aboutMe.setId(id);
		aboutMe.setDetails(details);
		aboutMe.setSection(section);
		aboutMe.setCooment(comment);
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

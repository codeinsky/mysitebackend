package com.myweb.site;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.myweb.site.beans.AboutMe;
import com.myweb.site.beans.AdminLogIn;
import com.myweb.site.beans.Projects;
import com.myweb.site.beans.Visitor;
import com.myweb.site.beans.Vote;
import com.myweb.site.beans.repo.AboutMeRepo;
import com.myweb.site.beans.repo.AdminLogInRepo;
import com.myweb.site.beans.repo.ProjectsRepo;
import com.myweb.site.beans.repo.VisitorRepo;
import com.myweb.site.beans.repo.VoteRepo;

@SpringBootTest
class MyWebSiteApplicationTests {
	
	@Autowired
	VoteRepo voteRepo;
	
	@Autowired 
	VisitorRepo visitorRepo;
	
	@Autowired 
	ProjectsRepo projectsRepo;
	
	@Autowired 
	AdminLogInRepo adminLogInRepo;
	
	@Autowired 
	AboutMeRepo aboutMeRepo;
	
	
	

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testVote() {
		Vote testVote = new Vote();
		testVote.setId(1);
		testVote.setLiked(true);
		testVote.setUnliked(false);
		testVote.setDate(null);
		voteRepo.save(testVote);
		
		}
	
	@Test 
	public void createVisitor() {
		Visitor newVisitor = new Visitor();
		newVisitor.setComment("Local visitor");
		newVisitor.setId(1);
		newVisitor.setIp("1.2.3.4.5");
		newVisitor.setDate(null);
		visitorRepo.save(newVisitor);
		
		
	}
	
	@Test 
	public void createProject() {
		Projects newProject = new Projects();
		newProject.setComment("that is my Android project");
		newProject.setLinks("GitHub");
		newProject.setName("SMS pecker");
		newProject.setSystem("Android studio");
		projectsRepo.save(newProject);
	}
	
	@Test 
	public void createAboutMe() {
		AboutMe newAboutMe = new AboutMe();
		newAboutMe.setCooment("JAVA EE");
		newAboutMe.setDetails("Hibernet, Spring boot");
		newAboutMe.setSection("Experience");
		newAboutMe.setId(1);
		aboutMeRepo.save(newAboutMe);
		
	}
	
	@Test
	public void createUser() {
		
		AdminLogIn newAdminLogin = new AdminLogIn();
		newAdminLogin.setEmail("mail@mail.com");
		newAdminLogin.setPassWord("1234");
		newAdminLogin.setPassWord("+123987654");
		newAdminLogin.setUserName("myUser");
		newAdminLogin.setId(1);
		adminLogInRepo.save(newAdminLogin);
	}

}

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
import com.myweb.site.beans.repo.VoteJpaRepo;
import com.myweb.site.beans.repo.VoteRepo;
import com.myweb.site.dao.MySiteDAO;

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
	
	@Autowired 
	VoteJpaRepo voteJpaRepo;
	
	@Autowired 
	MySiteDAO mySiteDAO;
	

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testVote() {
		Vote testVote = new Vote();
		testVote.setLiked(true);
		testVote.setDisliked(null);
		testVote.setDate(null);
		testVote.setIpVoted("1.1.172.30.45");
		voteRepo.save(testVote);
		
		}
	
	@Test 
	public void createVisitor() {
		Visitor newVisitor = new Visitor();
		newVisitor.setComment("Local visitor");
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
		aboutMeRepo.save(newAboutMe);
		
	}
	
	@Test
	public void createUser() {
		
		AdminLogIn newAdminLogin = new AdminLogIn();
		newAdminLogin.setEmail("mail@mail.com");
		newAdminLogin.setPassWord("1234");
		newAdminLogin.setPassWord("+123987654");
		newAdminLogin.setUserName("myUser");
		adminLogInRepo.save(newAdminLogin);
	}
	
	
	@Test
	public void getLikes() {
		int likes = mySiteDAO.getLikes();
		System.out.print("Like count is" + likes);
	}
	
	@Test 
	public void getDislikes() {
		int dislikes = mySiteDAO.getDislikes();
		System.out.print("Dislike count is:" + dislikes);
	}
//	@Test
//	public void getLiks()  {
//		 System.out.print("All likes count " + mySiteDAO.getLikeCount());
//	}

}

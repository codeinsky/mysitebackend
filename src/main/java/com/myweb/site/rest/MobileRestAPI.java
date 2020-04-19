package com.myweb.site.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myweb.site.beans.AboutMe;
import com.myweb.site.beans.Projects;
import com.myweb.site.beans.Visitor;
import com.myweb.site.beans.Vote;
import com.myweb.site.dao.MySiteDAO;
import com.myweb.site.security.JwtUtil;

@RestController
@CrossOrigin("*")
public class MobileRestAPI {
	
	@Autowired
	MySiteDAO mySiteDAO;
	
	@Autowired 
	private AuthenticationManager authecationManager;
	
	@Autowired
	private UserDetailsService userDetailsService; 
	
	@Autowired
	private JwtUtil jwtUtil;
	
	
	@RequestMapping(value="/android/getvisitorcount", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public int getVisitorCount(){
		return mySiteDAO.getVisitorCount();
		
	}
	
	@RequestMapping(value="/android/getlikescount", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public int getLikes(){
		return mySiteDAO.getLikes();
		
	}
	
	@RequestMapping(value="/android/getdislikescount", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public int getDislikes(){
		return mySiteDAO.getDislikes();
		
	}
	
	@RequestMapping(value="/android/getallvotes", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Vote> getAllVote(){
		return mySiteDAO.getAllVotes();
		
	}
	
	//works {"id":null,"section":"education","details":"flight","cooment":"testComment1"}
	@RequestMapping(value="/android/setaboutme", method=RequestMethod.POST , consumes= MediaType.APPLICATION_JSON_VALUE) 
	public void newVisitor(@RequestBody AboutMe aboutMe) {
		mySiteDAO.addAboutMeSection(aboutMe);
	}
	
	@RequestMapping(value="/android/getallaboutme", method=RequestMethod.GET , produces= MediaType.APPLICATION_JSON_VALUE) 
	public Iterable<AboutMe> getAbouteMe() {
		return  mySiteDAO.getAllAboutMe();
		
	}
	
	@RequestMapping(value="/android/getallprojects", method=RequestMethod.GET , produces= MediaType.APPLICATION_JSON_VALUE) 
	public Iterable<Projects> getAllProjects() {
		return mySiteDAO.getAllProjects();
		
	}
	//works {"id":null,"name":"backend","system":"JAVA project","comment":"my project","links":"GitHub"}
	@RequestMapping(value="/android/setproject", method=RequestMethod.POST , consumes= MediaType.APPLICATION_JSON_VALUE) 
	public void newVisitor(@RequestBody Projects project) {
		mySiteDAO.setProject(project);
	}
	
	@RequestMapping(value="/android/deleteproject/{id}", method=RequestMethod.DELETE)
	public void deleteProject(@PathVariable("id") int id ) {
		mySiteDAO.deleteProject(id);
		
	}
	
	@RequestMapping(value="/android/deleteaboutme/{id}", method=RequestMethod.DELETE)
	public void deleteAbout(@PathVariable("id") int id ) {
		mySiteDAO.deleteAboutMeSection(id);
		
	}
	
	@RequestMapping(value="/android/getallvisitors", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Visitor> getAllVisitors(){
		return mySiteDAO.getAllVisitors();
		
	}

}

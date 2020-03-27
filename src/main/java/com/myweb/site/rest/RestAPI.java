package com.myweb.site.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myweb.site.beans.AboutMe;
import com.myweb.site.beans.Projects;
import com.myweb.site.beans.Visitor;
import com.myweb.site.beans.Vote;
import com.myweb.site.dao.MySiteDAO;

@Controller 
@CrossOrigin("*")
public class RestAPI {
	
	@Autowired
	MySiteDAO mySiteDAO;
	
	@RequestMapping(value="/rest/vote" , method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void vote(@RequestBody Vote vote ) {
		mySiteDAO.vote(vote);
	}
	
	@RequestMapping(value="/rest/visitor" , method=RequestMethod.POST , consumes= MediaType.APPLICATION_JSON_VALUE) 
	public void newVisitor(Visitor visitor) {
		mySiteDAO.visitor(visitor);
	}
	
	@RequestMapping(value="/rest/setproject" , method=RequestMethod.POST , consumes= MediaType.APPLICATION_JSON_VALUE) 
	public void newVisitor(Projects project) {
		mySiteDAO.setProject(project);
	}
	
	@RequestMapping(value="/rest/setaboutme" , method=RequestMethod.POST , consumes= MediaType.APPLICATION_JSON_VALUE) 
	public void newVisitor(AboutMe aboutMe) {
		mySiteDAO.addAboutMeSection(aboutMe);
	}
	
	@RequestMapping(value="/rest/getallprohects" , method=RequestMethod.GET , produces= MediaType.APPLICATION_JSON_VALUE) 
	public Iterable<Projects> getAllProjects() {
		Iterable<Projects> myProjects =mySiteDAO.getAllProjects();
		return myProjects; 
		
	}
	
	@RequestMapping(value="/rest/getallaboutme" , method=RequestMethod.GET , produces= MediaType.APPLICATION_JSON_VALUE) 
	public Iterable<AboutMe> getAbouteMe() {
		Iterable<AboutMe> allAboutMe =mySiteDAO.getAllAboutMe();
		return allAboutMe; 
		
	}
	
	@RequestMapping(value="/rest/deleteproject/{id}" , method=RequestMethod.DELETE)
	public void deleteProject(@PathVariable("id") int id ) {
		mySiteDAO.deleteProject(id);;
		
	}
	
	@RequestMapping(value="/rest/deleteaboutme/{id}" , method=RequestMethod.DELETE)
	public void deleteAbout(@PathVariable("id") int id ) {
		mySiteDAO.deleteAboutMeSection(id);;
		
	}
	
	

	
	
	
	
	

}

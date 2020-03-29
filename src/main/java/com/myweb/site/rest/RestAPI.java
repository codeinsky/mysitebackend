package com.myweb.site.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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

@RestController 
@CrossOrigin("*")
public class RestAPI {
	
	@Autowired
	MySiteDAO mySiteDAO;
	
	@RequestMapping(value="/test" , method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String  test() {
		return("Server responses");
	}
	// works {"id":null,"liked":true,"unliked":true,"date":null}
	@RequestMapping(value="/rest/vote" , method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void vote(@RequestBody Vote vote ) {
		mySiteDAO.vote(vote);
	}
	//works {"id":null,"date":null,"ip":"1.2.3.4.5","comment":"comment"}
	@RequestMapping(value="/rest/visitor", method=RequestMethod.POST , consumes= MediaType.APPLICATION_JSON_VALUE) 
	public void newVisitor(@RequestBody Visitor visitor) {
		mySiteDAO.visitor(visitor);
	}
	//works {"id":null,"name":"backend","system":"JAVA project","comment":"my project","links":"GitHub"}
	@RequestMapping(value="/rest/setproject", method=RequestMethod.POST , consumes= MediaType.APPLICATION_JSON_VALUE) 
	public void newVisitor(@RequestBody Projects project) {
		mySiteDAO.setProject(project);
	}
	
	//works {"id":3,"section":"hobbies","comment":"drone","details":"flight"}
	@RequestMapping(value="/rest/setaboutme", method=RequestMethod.POST , consumes= MediaType.APPLICATION_JSON_VALUE) 
	public void newVisitor(@RequestBody AboutMe aboutMe) {
		mySiteDAO.addAboutMeSection(aboutMe);
	}
	
	@RequestMapping(value="/rest/getallprohects", method=RequestMethod.GET , produces= MediaType.APPLICATION_JSON_VALUE) 
	public Iterable<Projects> getAllProjects() {
		return mySiteDAO.getAllProjects();
		
	}
	
	@RequestMapping(value="/rest/getallaboutme", method=RequestMethod.GET , produces= MediaType.APPLICATION_JSON_VALUE) 
	public Iterable<AboutMe> getAbouteMe() {
		return  mySiteDAO.getAllAboutMe();
		
	}
	
	@RequestMapping(value="/rest/deleteproject/{id}", method=RequestMethod.DELETE)
	public void deleteProject(@PathVariable("id") int id ) {
		mySiteDAO.deleteProject(id);;
		
	}
	
	@RequestMapping(value="/rest/deleteaboutme/{id}", method=RequestMethod.DELETE)
	public void deleteAbout(@PathVariable("id") int id ) {
		mySiteDAO.deleteAboutMeSection(id);;
		
	}
	
	@RequestMapping(value="/getallvisitors", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Visitor> getAllVisitors(){
		return mySiteDAO.getAllVisitors();
		
	}
	
	@RequestMapping(value="/getallvotes", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Vote> getAllVote(){
		return mySiteDAO.getAllVotes();
		
	}
	
	
}

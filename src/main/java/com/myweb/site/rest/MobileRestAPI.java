package com.myweb.site.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myweb.site.beans.Visitor;
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
	

}

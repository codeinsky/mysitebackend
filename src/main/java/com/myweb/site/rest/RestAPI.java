package com.myweb.site.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.myweb.site.dao.MySiteDAO;

@Controller 
@CrossOrigin("*")
public class RestAPI {
	
	@Autowired
	MySiteDAO mySiteDAO;
	

}

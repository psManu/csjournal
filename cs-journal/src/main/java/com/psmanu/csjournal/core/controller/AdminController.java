package com.psmanu.csjournal.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	
	@RequestMapping("/admin")
	public String admin(){
		
		return "adminHome";
	}
	
	
	@RequestMapping("/admin/addArtTitle")
	public String addArtTitle(){
		
		
		return "dashbrd_includes/addArtTitle";
	}

}

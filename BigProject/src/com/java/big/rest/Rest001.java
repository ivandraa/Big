package com.java.big.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.big.service.GeneralCaseService;

@Controller
@RequestMapping("rest001")
public class Rest001 {
	
	@Autowired
	private GeneralCaseService generalservice;
	
	@RequestMapping(value = "/callExample")
	public void callExampleService() {
		
		generalservice.example();
	}

}

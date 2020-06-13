package com.bold.appws.ui.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bold.appws.ui.modelrequest.TemplateDetailsRequestModel;
import com.bold.appws.ui.modelresponse.TemplateModelResponse;
import com.bold.appws.ui.service.GenerateTemplateService;

@RestController
@RequestMapping ("/") //http://localhost:8080/users
public class UserController {
	
	@Autowired
	private GenerateTemplateService generateTemplateService;
	
	@CrossOrigin
	@PostMapping (value="users", consumes = {
			MediaType.APPLICATION_JSON_VALUE })
	public String postData(@RequestBody TemplateDetailsRequestModel templateDetails) {
		
		
				String successMessage = generateTemplateService.generateTemplate(templateDetails);
				System.out.println(successMessage);	
				return successMessage;
		
	}
	
}

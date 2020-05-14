package com.bold.appws.ui.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bold.appws.ui.modelrequest.TemplateDetailsRequestModel;

@RestController
@RequestMapping("users")//http://localhost:8080/users
public class UserController {
	
	@CrossOrigin
	@PostMapping (consumes = {
			MediaType.APPLICATION_JSON_VALUE
	})
	public String postData(@RequestBody TemplateDetailsRequestModel templateDetails) {
		System.out.println("Title:" + templateDetails.getTitle());
		
		return "<table width=\"50%\" border=\"1\">\r\n" + 
				"						<colgroup>\r\n" + 
				"    <col style={{width:\"250px\"}}/>\r\n" + 
				"    <col style={{width:\"600px\"}}/>\r\n" + 
				"  </colgroup>	\r\n" + 
				"		<tr id=\"tabletitle\"><td colspan=\"2\">"+templateDetails.getTitle()+"</td></tr>\r\n" + 
				"	<tr id=\"tableticket\"><td colspan=\"2\"><span>Ticket information:</span><span>JIRA: {this.state.jiraticket}</span></td></tr>\r\n" + 
				"		<tr  ><td class=\"rowname\" >Platform</td><td>{this.state.platform}</td></tr>\r\n" + 
				"						</table>";
	}
}

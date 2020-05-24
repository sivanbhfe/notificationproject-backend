package com.bold.appws.ui.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
		String notTitle = templateDetails.getTitle();
		
		String htmlbody = "<html>\r\n" + 
				"<table border=\"1\">\r\n" + 
				"<colgroup>\r\n" + 
				"<col style=\"width:250px\"/>\r\n" + 
				"<col style=\"width:600px\"/>\r\n" + 
				"</colgroup>\r\n" + 
				"<tbody>\r\n" + 
				"<tr id=\"tabletitle\" style=\"font-size:50px;font-family:calibri;color:rgb(102, 148, 102);text-align:center;height:100px\">\r\n" + 
				"<td colspan=\"2\">"+notTitle+"</td>\r\n" + 
				"</tr>\r\n" + 
				"<tr id=\"tableticket\">\r\n" + 
				"<td colspan=\"2\"><span>Ticket information: </span>\r\n" + 
				"<span>JIRA: </span><span>jira</span>\r\n" + 
				"<span>ServiceNow: </span><span>servicenow</span>\r\n" + 
				"<span>Webstar: </span><span>webstar</span>\r\n" + 
				"</td>\r\n" + 
				"</tr>\r\n" + 
				"<tr><td style=\"text-align:right;font-family:calibri;font-weight:bold;font-size:20px\" id=\"tableplatform\" >Platform</td>\r\n" + 
				"<td>platform</td></tr>\r\n" + 
				"<tr><td style=\"text-align:right;font-family:calibri;font-weight:bold;font-size:20px\" id=\"tableplatform\" >Status</td>\r\n" + 
				"<td>Status</td></tr>\r\n" + 
				"<tr><td style=\"text-align:right;font-family:calibri;font-weight:bold;font-size:20px\" id=\"tableplatform\" >Start time & End time</td>\r\n" + 
				"<td>Start time & End time</td></tr>\r\n" + 
				"<tr><td style=\"text-align:right;font-family:calibri;font-weight:bold;font-size:20px\" id=\"tableplatform\" >Incident Manager</td>\r\n" + 
				"<td>Incident Manager</td></tr>\r\n" + 
				"<tr><td colspan=\"2\" style=\"font-family:calibri;font-size:12px\">Please contact  GTO APAC Content Support via reply to this \r\n" + 
				"<a href=\"mailto:sivabalan.shanmugasiva@lexisnexis.com\">email</a> if you have any queries/concerns.</td></tr>\r\n" + 
				"<tr><td colspan=\"2\" style=\"font-family:calibri;font-size:14px\">Regards<br/>GTO APAC Content Support<br/>\r\n" + 
				"Email: <a href=\"mailto:sivabalan.shanmugasiva@lexisnexis.com\">CSS (LNG - AUS)</a><br/>\r\n" + 
				"<span style=\"fon-size:15px\">Note: Internal & External</span>\r\n" + 
				"</td></tr>\r\n" + 
				"</tbody>\r\n" + 
				"</table>\r\n" +
				"</html>";
		File file = new File("C:\\Users\\Sivabalan\\Desktop\\test.html");
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(file));
			try {
				bw.write(htmlbody);
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return "text";
	}
}

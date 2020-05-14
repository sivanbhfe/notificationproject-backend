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
		
		return "	<table border=\"1\">\r\n" + 
				"							<colgroup>\r\n" + 
				"		<col style={{width:\"250px\"}}/>\r\n" + 
				"		<col style={{width:\"600px\"}}/>\r\n" + 
				"	  </colgroup><tbody>\r\n" + 
				"			<tr id=\"tabletitle\" style={{fontSize: \"50px\", fontFamily: \"calibri\", color:\"rgb(102, 148, 102)\", \r\n" + 
				"				textAlign: \"center\", height: \"100px\"}}>\r\n" + 
				"					<td colSpan=\"2\">{this.state.title}</td>\r\n" + 
				"					</tr>\r\n" + 
				"		<tr id=\"tableticket\">\r\n" + 
				"			<td colSpan=\"2\"><span>Ticket information: </span>\r\n" + 
				"			<span>{this.state.jiraticket!==\"\" ? <span>JIRA: <a href={this.state.jiraticket}>{this.state.jiraticket}</a> </span>:<span></span>}\r\n" + 
				"			</span>\r\n" + 
				"			<span>{this.state.snticket!==\"\" ? <span>ServiceNow: <a href={this.state.snticket}>{this.state.snticket}</a> </span>:<span></span>}\r\n" + 
				"			</span>\r\n" + 
				"			<span>{this.state.webstarticket!==\"\" ? <span>Webstar: <a href={this.state.webstarticket}>{this.state.webstarticket}</a></span>:<span></span>}\r\n" + 
				"			</span></td>\r\n" + 
				"			</tr>\r\n" + 
				"			<tr><td style={{textAlign:\"right\",fontFamily: \"calibri\",fontWeight:\"bold\", fontSize:\"20px\"}} \r\n" + 
				"			id=\"tableplatform\" >Platform</td>\r\n" + 
				"			<td>{this.state.platform}</td></tr>\r\n" + 
				"			<tr><td style={{textAlign:\"right\",fontFamily: \"calibri\",fontWeight:\"bold\", fontSize:\"20px\"}} \r\n" + 
				"			id=\"tablestatus\" >Status</td>\r\n" + 
				"			<td>{this.state.status}</td></tr>\r\n" + 
				"			<tr><td style={{textAlign:\"right\",fontFamily: \"calibri\",fontWeight:\"bold\", fontSize:\"20px\"}} \r\n" + 
				"			id=\"tabletime\" >Start time & End time</td>\r\n" + 
				"			<td>{this.state.timewindow}</td></tr>\r\n" + 
				"			{this.state.incidentmanager!==\"\" ?\r\n" + 
				"			<tr><td style={{textAlign:\"right\",fontFamily: \"calibri\",fontWeight:\"bold\", fontSize:\"20px\"}} \r\n" + 
				"			id=\"tabletime\" >Incident Manager</td>\r\n" + 
				"			<td><a href={this.state.incidentmanageremail}> {this.state.incidentmanager}</a></td></tr> : \"\"\r\n" + 
				"			}\r\n" + 
				"			<tr><td style={{textAlign:\"right\",fontFamily: \"calibri\",fontWeight:\"bold\", fontSize:\"20px\"}} \r\n" + 
				"			id=\"tablesummary\" >Summary</td>\r\n" + 
				"			<td>{this.state.summary}</td></tr>\r\n" + 
				"			<tr><td colSpan=\"2\" style={{fontFamily: \"calibri\",fontSize:\"20px\"}}>Please contact  GTO APAC Content Support via reply to this \r\n" + 
				"				<a href=\"mailto:sivabalan.shanmugasiva@lexisnexis.com\">email</a> if you have any queries/concerns.</td></tr>\r\n" + 
				"			<tr><td colSpan=\"2\" style={{fontFamily: \"calibri\",fontWeight:\"bold\", fontSize:\"20px\"}}>Regards<br/>GTO APAC Content Support<br/>\r\n" + 
				"			Email: <a href=\"mailto:sivabalan.shanmugasiva@lexisnexis.com\">CSS (LNG - AUS)</a><br/>\r\n" + 
				"			<span style={{fontSize:\"15px\"}}>Note: Internal & External</span>\r\n" + 
				"			</td></tr>\r\n" + 
				"			</tbody>\r\n" + 
				"							</table>";
	}
}

package com.bold.appws;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.bold.appws.ui.controller.UserController;
import com.bold.appws.ui.modelrequest.TemplateDetailsRequestModel;
import com.bold.appws.ui.service.GenerateTemplateService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@SpringBootTest
@AutoConfigureMockMvc
class MobileAppNotificationApplicationTests {
	
//	@Mock
//	private TemplateDetailsRequestModel templateDetails;
	
	@Autowired
    private MockMvc mvc;

	@Mock
	private UserController userController;
	
	@Mock
	private GenerateTemplateService generateTemplateService;
	
	@Test
	void templateGeneratedWithoutError() throws Exception {
		 
		
	/*
	  	templateDetails.setTitle("Testtitle");
		 templateDetails.setPlatform("Testplatform");
		 templateDetails.setJira("TestJira");
		 templateDetails.setServicenow("TestServiceNow");
		 templateDetails.setWebstar("TestWebstar");
		 templateDetails.setStatus("Open");
		 templateDetails.setIncimanager("TestIncimanager");
		 templateDetails.setIncimanageremail("TestIncimanageremail");
		 templateDetails.setStarttime("TestStarttime");
		 templateDetails.setEndtime("TestEndtime");
		templateDetails.setNotitype("outageholiday");
		templateDetails.setSummary("TestSummary");
		Gson gson = new GsonBuilder().create();
		String jsonString = gson.toJson(templateDetails);
		String output=mvc.perform(post("/users").
				contentType(MediaType.APPLICATION_JSON).content(jsonString))
				.andReturn().getResponse().getContentAsString();
		*/
		
		String output=mvc.perform(post("/users").
				contentType(MediaType.APPLICATION_JSON).content("{\"title\":\"title\", "
						+ "\"platform\":\"platform\", \"jira\":\"jira\", "
						+ "\"servicenow\":\"servicenow\", \"webstar\":\"webstar\", "
						+ "\"status\":\"Open\", \"incimanager\":\"incimanager\", "
						+ "\"incimanageremail\":\"incimanageremail\","
						+ " \"starttime\":\"starttime\", \"endtime\":\"endtime\", "
						+ "\"notitype\":\"outageholiday\", \"summary\":\"SUMMARYY\"}"))
				.andReturn().getResponse().getContentAsString();		
		System.out.println("OUTPUT:"+output);
		assertTrue(output.equalsIgnoreCase("text"));
	}

}

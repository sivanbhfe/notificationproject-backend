package com.bold.appws.ui.modelrequest;


public class TemplateDetailsRequestModel {
	private String title;
	private String platform;
	private String jira;
	private String servicenow;
	private String webstar;
	private String status;
	private String incimanager;
	private String incimanageremail;
	private String starttime;
	private String endtime;
	private String notitype;
	private String summary;



	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getNotitype() {
		return notitype;
	}

	public void setNotitype(String notitype) {
		this.notitype = notitype;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getJira() {
		return jira;
	}

	public void setJira(String jira) {
		this.jira = jira;
	}

	public String getServicenow() {
		return servicenow;
	}

	public void setServicenow(String servicenow) {
		this.servicenow = servicenow;
	}

	public String getWebstar() {
		return webstar;
	}

	public void setWebstar(String webstar) {
		this.webstar = webstar;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIncimanager() {
		return incimanager;
	}

	public void setIncimanager(String incimanager) {
		this.incimanager = incimanager;
	}

	public String getIncimanageremail() {
		return incimanageremail;
	}

	public void setIncimanageremail(String incimanageremail) {
		this.incimanageremail = incimanageremail;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	/*
	 @Override
	    public String toString() {
	        return "TemplateDetailsRequestModel "
	        		+ "[title=" + this.title + 
	        		", platform=" + this.platform + 
	        		", jira=" + this.jira + 
	        		", servicenow=" + this.servicenow + 
	        		", webstar=" + this.webstar + 
	        		", status=" + this.status + 
	        		", incimanager=" + this.incimanager + 
	        		", incimanageremail=" + this.incimanageremail + 
	        		", starttime=" + this.starttime + 
	        		", endtime=" + this.endtime + 
	        		", notitype=" + this.notitype + 
	        		", summary=" + this.summary + 
	        		"]";
	    }
*/
}

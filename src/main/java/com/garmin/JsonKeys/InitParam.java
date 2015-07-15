package com.garmin.JsonKeys;

public class InitParam {
	
	private String templatePath;
	private String templateOverridePath;
	private boolean useJSP;
	private String logLocation;
	private int dataLog;
	private String mailHost;
	private String mailHostOverride;


	public String getTemplatePath() {
		return templatePath;
	}

	public void setTemplatePath(String templatePath) {
		this.templatePath = templatePath;
	}

	public String getTemplateOverridePath() {
		return templateOverridePath;
	}

	public void setTemplateOverridePath(String templateOverridePath) {
		this.templateOverridePath = templateOverridePath;
	}

	public boolean isUseJSP() {
		return useJSP;
	}

	public void setUseJSP(boolean useJSP) {
		this.useJSP = useJSP;
	}

	public String getLogLocation() {
		return logLocation;
	}

	public void setLogLocation(String logLocation) {
		this.logLocation = logLocation;
	}

	public int getDataLog() {
		return dataLog;
	}

	public void setDataLog(int dataLog) {
		this.dataLog = dataLog;
	}

	public String getMailHost() {
		return mailHost;
	}

	public void setMailHost(String mailHost) {
		this.mailHost = mailHost;
	}

	public String getMailHostOverride() {
		return mailHostOverride;
	}

	public void setMailHostOverride(String mailHostOverride) {
		this.mailHostOverride = mailHostOverride;
	}

}

package com.garmin.JsonKeys;

public class InitParam {
	private String templatePath;
	private String templateOverridePath;
	private boolean useJsp;
	private int dataLog;
	private String mailHost;
	private String mailHostOverride;
	

	public InitParam(String templatePath, String templateOverridePath,
			boolean useJsp, int dataLog, String mailHost,
			String mailHostOverride) {
		super();
		this.templatePath = templatePath;
		this.templateOverridePath = templateOverridePath;
		this.useJsp = useJsp;
		this.dataLog = dataLog;
		this.mailHost = mailHost;
		this.mailHostOverride = mailHostOverride;
	}

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

	public boolean isUseJsp() {
		return useJsp;
	}

	public void setUseJsp(boolean useJsp) {
		this.useJsp = useJsp;
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

package com.garmin.JsonKeys;

public class ServletMapping {
	private String cofaxCDS;
	private String cofaxEmail;

	public ServletMapping(String cofaxCDS, String cofaxEmail) {
		super();
		this.cofaxCDS = cofaxCDS;
		this.cofaxEmail = cofaxEmail;
	}

	public String getCofaxCDS() {
		return cofaxCDS;
	}

	public void setCofaxCDS(String cofaxCDS) {
		this.cofaxCDS = cofaxCDS;
	}

	public String getCofaxEmail() {
		return cofaxEmail;
	}

	public void setCofaxEmail(String cofaxEmail) {
		this.cofaxEmail = cofaxEmail;
	}

}

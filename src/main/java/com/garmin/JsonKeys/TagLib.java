package com.garmin.JsonKeys;

public class TagLib {
	private String taglibUri;
	private String taglibLocation;

	public TagLib(String taglibUri, String taglibLocation) {
		super();
		this.taglibUri = taglibUri;
		this.taglibLocation = taglibLocation;
	}

	public String getTaglibUri() {
		return taglibUri;
	}

	public void setTaglibUri(String taglibUri) {
		this.taglibUri = taglibUri;
	}

	public String getTaglibLocation() {
		return taglibLocation;
	}

	public void setTaglibLocation(String taglibLocation) {
		this.taglibLocation = taglibLocation;
	}

}

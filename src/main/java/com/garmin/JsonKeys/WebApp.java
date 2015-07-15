package com.garmin.JsonKeys;

import java.util.ArrayList;
import java.util.List;

public class WebApp {
	private List<Servlet> servlet;
	private ServletMapping servletMapping;
	private Taglib taglib;

	public List<Servlet> getServlet() {
		return servlet;
	}

	public void setServlet(ArrayList<Servlet> servlet) {
		this.servlet = servlet;
	}

	public ServletMapping getServletMapping() {
		return servletMapping;
	}

	public void setServletMapping(ServletMapping servletMapping) {
		this.servletMapping = servletMapping;
	}

	public Taglib getTaglib() {
		return taglib;
	}

	public void setTaglib(Taglib taglib) {
		this.taglib = taglib;
	}

}

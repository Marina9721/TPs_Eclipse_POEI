package com.jee.controllers.tag;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class HeaderTag extends TagSupport {

	private static final long serialVersionUID = -8035762218514064168L;
	
	private String name;
	private String profile;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getProfile() {
		return profile;
	}
	
	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	@Override
	public int doStartTag() {
		JspWriter out = pageContext.getOut();
		System.out.println(name + "   " + profile);
		try {
			if(name != null && !"".equals(name)) {
				out.println("Welcome back " + name);
			}
			out.println("<p>Start Tag </p>"
					+ ""
					+ ""
					+ "<a href='/home'>Home</a>"
					+ "<a href='/contact'>Contact</a>"
					+ "<a href='/product'>Product</a>"
					+ ""
					+ ""
					+ "");
			if(profile != null) {
				out.println( "<a href='"+ profile +"' >Profil</a>");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return 2;
	}
	
	@Override
	public int doEndTag() {
		JspWriter out = pageContext.getOut();
		try {
			out.println("<p>End Tag </p>");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return 4;
	}

}

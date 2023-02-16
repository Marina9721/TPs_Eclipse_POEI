package com.jee.controllers.tag;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class LoginForm extends TagSupport{

	private static final long serialVersionUID = 8627244201584106802L;
	
	private String login;
	private String password;
	private String action;
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	@Override
	public int doStartTag() {
		JspWriter out = pageContext.getOut();
		
		try {
			if(this.action != null) {
				out.println("<form action='" + this.action + "' method=\"post\">\r\n");
			}else {
				out.println("<form method=\"post\">\r\n");
			}
			out.print("			Login:\r\n"
					+ "			<input type=\"text\" name=\"login\" value='"+ this.login +"'>\r\n"
					+ "			<br>\r\n"
					+ "\r\n"
					+ "			Password:\r\n"
					+ "			<input type=\"text\" name=\"password\" value='"+ this.password +"'>\r\n"
					+ "			<br>\r\n"
					+ "			\r\n"
					+ "			<input type=\"submit\" value=\"Valider\">	");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return 2;
	}
	
	public int doEndTag() {
		JspWriter out = pageContext.getOut();
		try {
			out.println("\t\t</form> ");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return 4;
	}

}

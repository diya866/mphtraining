package com.test;


import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.*;
public class GreetUser extends TagSupport {
 private static final long serialVersionUID=1L;
 public int doStartTag() {
	JspWriter out=null;
	try {
		out=pageContext.getOut();
	out.println("wELCOME TO JAVA ...");
	
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return SKIP_BODY;
}
}

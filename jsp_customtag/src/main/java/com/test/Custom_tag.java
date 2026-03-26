package com.test;
import java.util.*;
import jakarta.servlet.jsp.tagext.*;
import jakarta.servlet.jsp.JspWriter;
public class Custom_tag extends TagSupport {
	private static final long serialVersionUID=1L;
	public int doStartTag() {
		JspWriter out=null;
		try {
			out=pageContext.getOut();
		out.println("current date:"+new Date());
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

}

package com.deloitte.cms.model;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomTagAddress extends TagSupport {
	

	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		try {
			out.println("<h2>Shakthinagar</h2>");
			out.println("<h2>Tumkur</h2>");
			out.println("<h2>Karnataka</h2>");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return super.doStartTag();
	}
}

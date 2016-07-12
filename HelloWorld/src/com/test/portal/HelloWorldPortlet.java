package com.test.portal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.RenderMode;
public class HelloWorldPortlet extends GenericPortlet {
	@RenderMode(name = "VIEW")
	public void sayHello(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("My Hello World Portal");
	}
}

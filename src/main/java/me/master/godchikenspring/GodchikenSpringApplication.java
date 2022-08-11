package me.master.godchikenspring;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class GodchikenSpringApplication {

	public static void main(String[] args) throws LifecycleException {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);

		Context context = tomcat.addContext("/", "/");

		HttpServlet servlet = new HttpServlet() {
			@Override
			protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
				PrintWriter printWriter = resp.getWriter();
				printWriter.println("HTML Tag Here or Not");
			}
		};
		String servletName = "GodchikenServlet";

		tomcat.addServlet("/", servletName, servlet);

		context.addServletMappingDecoded("/hello", servletName);

		// tomcat 9 before
		/*tomcat.start();
		tomcat.getServer().await();*/

		// tomcat 9 after
		tomcat.getConnector();
		tomcat.start();
		tomcat.getServer().await();
	}

}

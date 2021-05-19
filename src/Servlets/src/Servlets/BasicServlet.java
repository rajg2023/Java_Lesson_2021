/**
 * 
 */
package Servlets;
import java.io.*;
//import java.servlet.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author raj
 *
 */
public class BasicServlet extends HttpServlet {

	private String message;
	public void init() throws ServletException{
		message = " Yay!! we got to play with the servlets";
		
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>");
	}
 public void destroy() {
	 
 }
}

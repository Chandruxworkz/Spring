package com.xworkz.fire;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/switch")
public class Fire extends HttpServlet {
	public Fire() {
		System.out.println("fire created using default constructor...");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("executing service in firesevelet\n");
		String name = req.getParameter("name");
		String company = req.getParameter("company");
		String salary = req.getParameter("salary");
		System.out.println("Name "+name +"company "+ company +"salary " +salary);
		
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.append("<html>").append("<body>").append("<h1>")	
		.append("im ypur web project")
		.append("</h1>")
		.append("</br>")
		.append("name :").append(name)
		.append("</br>")
		.append("company :").append(company)
		.append("</br>")
		.append("salary :").append(salary)
		.append("</html>").append("</body>");
		
		}

			
	}
	


package com.xworkz.web.job.sevlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.WebSocket.Listener;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.job.dto.JobDTO;

@WebServlet(loadOnStartup = 6, urlPatterns = "/job")
public class JobServlet extends HttpServlet {
	List<JobDTO> dto = new ArrayList<JobDTO>();

	public JobServlet() {
		System.out.println("Calling default constructor");

	}

@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Calling metod service ");
		resp.setContentType("text/html");
		String name = req.getParameter("aName");
		String email = req.getParameter("email");
			String phNum = req.getParameter("phNumber");
		String altNum = req.getParameter("AphNumber");
		String gender = req.getParameter("gender");
		String education = req.getParameter("edu");
		String yop = req.getParameter("year");
		String eBoard = req.getParameter("board");
		String adress = req.getParameter("location");
		String skill = req.getParameter("skill");
		String ctc = req.getParameter("package");
		String experience = req.getParameter("exp");
		String idName = req.getParameter("id");
		String idNum = req.getParameter("idn");
		System.out.println(name + email + phNum+altNum +gender + education + yop + eBoard + adress + skill + ctc
				+ experience + idName + idNum);
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.append("<html>").append("<body>").append("<h1>")	
		.append("JOB APPLICATION")
		.append("</h1>")
		.append("</br>")
		.append("Name "+name+" <br>")
		.append("Email "+email+" <br>")
		.append("Phone_nr "+phNum+" <br>")
		.append("Alternate Phone_nr "+altNum+" <br>")
		.append("Qualification "+education+" <br>")
		.append("Year of Passout "+yop+" <br>")
		.append("Education_Board "+eBoard+" <br>")
		.append("Adress "+adress+" <br>")
		.append("Salary "+ctc+" <br>")
		.append("Experience "+experience+" <br>")
		.append("Id_Proof "+idName+" <br>")
		.append("Id_ProofNum "+idNum+" <br>")
		
		.append("</html>").append("</body>");
		JobDTO dtos=new JobDTO(name, email, Long.parseLong(phNum), phNum, gender, education, yop, eBoard, adress, skill, ctc, experience, idName, idNum);
       System.out.println(dto.add(dtos));
}
}
		
		
		
		
		
		
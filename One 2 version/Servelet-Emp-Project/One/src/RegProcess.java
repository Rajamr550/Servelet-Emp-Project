import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	PrintWriter out = response.getWriter();
	
	String	email = request.getParameter("email");
	String	fname = request.getParameter("fname");
	String   pass = request.getParameter("pass");
	String   lname = request.getParameter("lname");
	String  age = request.getParameter("age");
	String mobile = request.getParameter("mobile");
	
    LoginProcess.addReg(email, pass, fname, lname, age , mobile);
    out.println("Reg successfully");
    RequestDispatcher rd = request.getRequestDispatcher("/aview.html"); 
    rd.include(request, response);
	}

}

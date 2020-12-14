import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class Details extends HttpServlet {  
  
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException  {
    
	  
   response.setContentType("text/html");  
   PrintWriter out = response.getWriter();  
     
  HttpSession session=request.getSession(false);  
  String fname=(String)session.getAttribute("fname");  
  String lname=(String)session.getAttribute("lname");  
  String age=(String)session.getAttribute("age");  

    //out.print("Hello ");  

//    out.println("Hello " + fname + " " +  lname);
//    out.println(" <br> ");
//    out.println("Age " + age);
//    out.println(" <br> ");
//    out.println("<a href='/One/success.html'><button>edit</button></a>");  
//    out.println(" <br> ");
//    out.println("<a href='/One/home.html'><button>home</button></a>");  
  
  response.sendRedirect("jsp/print.jsp");
    out.close();  

} 
      
  
}  





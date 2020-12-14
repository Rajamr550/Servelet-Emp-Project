import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LoginProcess.map.put("demo","demo");
	    String email = request.getParameter("email");
	    String pass = request.getParameter("pass");
		LoginProcess.map.put(email,pass);
		LoginProcess.showDetails(request,response);
		
	}

}

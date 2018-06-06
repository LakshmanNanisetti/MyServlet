import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class MyServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException{
		response.setContentType("text/html");
		PrintWriter out=null;
		try{
		out = response.getWriter();
		}catch(IOException ioe){
			System.out.println(ioe);
		}
		out.println("<html><body>\n<h1>Hello Readers</h1>\n</body><html>");
		
	}
}
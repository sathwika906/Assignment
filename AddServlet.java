package hellos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
	int  i=Integer.parseInt(request.getParameter("age"));
	int  j=Integer.parseInt(request.getParameter("smoke"));
	int  l=Integer.parseInt(request.getParameter("alcohol"));
	int  m=Integer.parseInt(request.getParameter("waist"));
	int  n=Integer.parseInt(request.getParameter("physical"));
	int  o=Integer.parseInt(request.getParameter("history"));
	int k=i+j+l+m+n+o;
	PrintWriter pw=response.getWriter();
	pw.println("result is"+k);
}
}
	
	
	
		
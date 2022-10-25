

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.setContentType("text/html");
        String firstname = request.getParameter("firstname");
        String middlename = request.getParameter("middlename");
        String lastname = request.getParameter("lastname");
        
        String gender = request.getParameter("gender");
        String pincode = request.getParameter("pin");
        String date = request.getParameter("birthday");
        
        //request.getSession().setAttribute("firstname", firstname);
        //request.getSession().setAttribute("middlename", middlename);
        
        
        //request.getSession().setAttribute("secondname", secondname);
        //request.getSession().setAttribute("dob" , dob);
        
        
        //request.getSession().setAttribute("pinnumber" , pinnumber);
        //request.getSession().setAttribute("gender" , gender);
        
//        response.sendRedirect("jsp/printout.jsp");
        response.sendRedirect("Add.html");
        
    


	}

}

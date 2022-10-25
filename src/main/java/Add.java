import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Add")
public class Add extends HttpServlet {
    private static final long serialVersionUID = 1L;

   
    public Add() {
    }

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        int num1=Integer.parseInt(request.getParameter("num1"));
        int num2=Integer.parseInt(request.getParameter("num2"));
        int num3=Integer.parseInt(request.getParameter("num3"));
        int num4=Integer.parseInt(request.getParameter("num4"));
        int num5=Integer.parseInt(request.getParameter("num5"));
        int num6=Integer.parseInt(request.getParameter("num6"));
        
        int sum=(num1+num2+num3+num4+num5+num6);
        out.print("THE TOTAL SCORE IS = "+sum);
        out.println("<body>");
        out.println("<html>");
//        out.println("<h4>"+
//       " A score above 4 indicates that the person may be at higher risk of NCDs and needs to be prioritized for attending screening for following NCDs and then confirmed if there is any of them."+
//       out.println(<h4> 1.Diabetes
//            2.Hypertension
//            3.Breast Cancer
//            4.Cervical Cancer
//            5.Oral Cancer*/
//            For those who are curious - more about NCD - https://www.who.int/news-room/fact-sheets/detail/noncommunicable-diseases "
//       </h4>" )
        out.println("<button onclick=location.href='registration.html'; align=\"center\" class=\"btn btn-primary\" >Back</button>");
        out.println("</body>");
        out.println("</html>");
    }

}
package com.jcg.mongodb.servlet;
  

import com.mongodb.client.MongoCollection; 
import com.mongodb.client.MongoDatabase; 
import org.bson.Document; 
import com.mongodb.MongoClient; 
//import com.mongodb.MongoCredential;
import com.mongodb.MongoException;
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
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String email;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		handleRequest(request, response);}
		public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
		{
	
		//response.setContentType("text/html");
        String firstname = request.getParameter("firstname");
        String middlename = request.getParameter("middlename");
        String lastname = request.getParameter("lastname");
        email=request.getParameter("email");
        String gender = request.getParameter("gender");
        String pincode = request.getParameter("pin");
        String date = request.getParameter("birthday");
        
        
        try (MongoClient mongo = new MongoClient( "localhost" , 27017 ))
	    {
	    
                MongoDatabase database = mongo.getDatabase("Project1Db"); 
		    
		    
		    try
		    {
		    	database.createCollection("PatientDetails");
		    } catch (Exception exception) 
		    {
		        System.err.println("Collection:- PatientDetails already Exists");
		    }
		    MongoCollection<Document> collection = database.getCollection("PatientDetails"); 
		    System.out.println(" PatientDetails selected successfully"); 
		    
		    try
		    {
		    	
				Document document = new Document("First Name", firstname)
						.append("Middle Name", middlename)
		    			.append("Last Name", lastname)
		    			.append("Email", email)
		    			.append("Gender", gender)
		    			.append("date", date)
		    			.append("Pincode", pincode);
		    			
		    			//Inserting document into the collection
		    			collection.insertOne(document);	
		    			
		    			request.getRequestDispatcher("/Add.jsp").forward(request, response);
		    }
		    catch (MongoException me) {
                System.err.println("Unable to insert due to an error: " + me);
		    }
		  }
        
        
    


	}
	
}
package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
import java.util.List;


import java.text.SimpleDateFormat;
import java.util.Date;

import DAO.addbookDao;
import DAO.loginDAO;
//import DAO.loginDAO;
import bean.addbookBean;
import bean.userBean;

/**
 * Servlet implementation class addbookServlet
 */
public class deletebookservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deletebookservlet() {
    //    super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	System.out.println("happy birthday");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int id=Integer.parseInt(request.getParameter("id"));
		try {
			if(new addbookDao().deleteBook(id)) {
				response.sendRedirect("./viewbook.jsp");
			}
			else {
				response.sendRedirect("./viewbook.jsp");
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
		
	
	
	//System.out.println("happy birthday");
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		

}
}

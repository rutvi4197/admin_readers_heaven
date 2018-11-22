package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.loginDAO;
import DAO.adminDAO;

/**
 * Servlet implementation class loginServlet
 */
public class changePasswordAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public changePasswordAdminServlet() {
    //    super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	System.out.println("happy birthday");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	//System.out.println("happy birthday");
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("hii shilpi");
		HttpSession session=request.getSession();
		Integer user_id=(Integer)session.getAttribute("user_id");
		System.out.println("id:  "+user_id);
		if(user_id==null) {
			response.sendRedirect("./index.jsp");
		}
		else
		{
		//int id=Integer.parseInt(request.getParameter("id"));
		String password=request.getParameter("password");
		String npassword=request.getParameter("npassword");
		String cpassword=request.getParameter("cpassword");
		try {
			if(password!=null) {
				int user_if = new adminDAO().checkPassword(user_id,password);
				System.out.println("hello"+user_if);
				if(user_if==1) {
			if (npassword.equals(cpassword)) {
				int user_i = new loginDAO().changePassword(user_id,npassword);
				System.out.println(user_i);
					response.sendRedirect("./dashboard.jsp");
				
			} else {
				System.out.println("New Password Not Match");
				response.sendRedirect("./changepasswordadmin.jsp");
			}
			}else
			{System.out.println("Current Password is Not Correct");
			response.sendRedirect("./changepasswordadmin.jsp");}}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	}
}

package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.loginDAO;
import bean.adminBean;

/**
 * Servlet implementation class loginServlet
 */
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
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
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		try {
			System.out.println("hii shilpi in try");
		adminBean user=new loginDAO().checkLogin(email, password);
		System.out.println("hii shilpi after checklogin");
		if(user!=null)
		{
			HttpSession session=request.getSession();	
			session.setAttribute("user_id", user.getAdmin_id());
			response.sendRedirect("dashboard.jsp");
		}
		else
		{
			response.sendRedirect("index.jsp");
		}
		
		}
		catch(Exception e)
		{
			System.out.println("Login Servlet "+e);
		}
	}

}

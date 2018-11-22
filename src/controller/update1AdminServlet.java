package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
			

import DAO.loginDAO;


/**
 * Servlet implementation class loginServlet
 */
public class update1AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update1AdminServlet() {
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
		int id=Integer.parseInt(request.getParameter("id"));
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String cpassword=request.getParameter("cpassword");
		try {
			if (password.equals(cpassword)) {
				int user_id = new loginDAO().updateUser(id,email, password);
				System.out.println(user_id);
					response.sendRedirect("./viewadmin.jsp");
				
			} else {
				System.out.println("Password Not Match");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}

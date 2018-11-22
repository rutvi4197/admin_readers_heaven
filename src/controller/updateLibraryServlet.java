package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.libraryDAO;
import bean.userBean;

/**
 * Servlet implementation class loginServlet
 */
public class updateLibraryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateLibraryServlet() {
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
		System.out.println("hii shilpi");
		
		String library_name=request.getParameter("library_name");
		String branch_name=request.getParameter("branch_name");
		String email=request.getParameter("email");
		String branch_address=request.getParameter("branch_address");
		
		int library_address_id=Integer.parseInt(request.getParameter("id"));
		System.out.println("hii ");
		int pincode=Integer.parseInt(request.getParameter("pincode"));
		String mobile_no=request.getParameter("mobile_no");
		try {
			
				
				if (new libraryDAO().updateLibraryAddress(library_name,library_address_id,branch_name,branch_address, mobile_no, pincode, email)) {
					
					
					response.sendRedirect("./library.jsp");
				}
		
		}
		catch(Exception e)
		{
			System.out.println("Login Servlet "+e);
		}
	}

}

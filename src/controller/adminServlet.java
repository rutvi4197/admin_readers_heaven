package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
			
import bean.adminBean;
import java.util.List;
import DAO.adminDAO;


/**
 * Servlet implementation class loginServlet
 */
public class adminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminServlet() {
    //    super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//	System.out.println("happy birthday");
			List<adminBean> listOfAdmin = null;
			String str=request.getParameter("action");
				try {
					System.out.println("in try");
				listOfAdmin = new adminDAO().getAllAdmin();
				request.setAttribute("listOfAdmin", listOfAdmin);
				request.getRequestDispatcher(str).forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("in catch");
				e.printStackTrace();
				}

		}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("hii shilpi");
		
		
	}

}

package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.dashboardDAO;
import bean.dashboard_adminBean;
import java.util.List;

/**
 * Servlet implementation class loginServlet
 */
public class dashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dashboardServlet() {
    //    super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	System.out.println("happy birthday");
	
		List<dashboard_adminBean> listOfLibrary = null;
		String str=request.getParameter("action");
			try {
				System.out.println("in try");
			listOfLibrary = new dashboardDAO().getDashboardDetails();
			request.setAttribute("listOfLibrary", listOfLibrary);
			request.getRequestDispatcher(str).forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("in catch");
			e.printStackTrace();
			}

	}
	//System.out.println("happy birthday");
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("hii shilpi");
	}

}

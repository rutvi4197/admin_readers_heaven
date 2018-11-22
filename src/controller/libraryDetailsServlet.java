package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.libraryDAO;
import bean.library_joinBean;
import java.util.List;

/**
 * Servlet implementation class loginServlet
 */
public class libraryDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public libraryDetailsServlet() {
    //    super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	System.out.println("happy birthday");
		int id=Integer.parseInt(request.getParameter("id"));
		List<library_joinBean> listOfLibrary = null;
		String str=request.getParameter("action");
			try {
				System.out.println("in try");
			listOfLibrary = new libraryDAO().getLibrary(id);
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

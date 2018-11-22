package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import bean.adminBean;

import DAO.adminDAO;


/**
 * Servlet implementation class deleteCartServlet
 */
public class updateAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int id=Integer.parseInt(request.getParameter("id"));
		List<adminBean> listAdmin = null;
		String str=request.getParameter("action");
			try {
				System.out.println("in try");
			listAdmin = new adminDAO().getAdminById(id);
			request.setAttribute("listAdmin", listAdmin);
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
		doGet(request, response);
	}

}

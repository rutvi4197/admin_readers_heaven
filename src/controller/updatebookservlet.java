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
public class updatebookservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updatebookservlet() {
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
		
		
	
}
		
	
	//System.out.println("happy birthday");
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("id"));
		System.out.println("id in servlet is: "+id);
		String book_title=request.getParameter("book_title");
		//System.out.println(nameofbook);
		String author=request.getParameter("author");
		int edition=Integer.parseInt(request.getParameter("edition"));
		String publisher=request.getParameter("publisher");
		String isbn=request.getParameter("isbn");
		int pages=Integer.parseInt(request.getParameter("pages"));
		int mrp=Integer.parseInt(request.getParameter("mrp"));
		String description=request.getParameter("description");
		int publish_year = Integer.parseInt(request.getParameter("publish_year"));
		String book_language=request.getParameter("book_language");
		int categorys=Integer.parseInt(request.getParameter("categorys"));
		Date d = new Date();
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		//String strDate = date.format(d);
		String modified_on=date.format(d);
		
		
		try {
			System.out.println("category  :"+categorys);
			int book_id=new addbookDao().updatebook(book_title,author,edition,publisher,isbn,pages,mrp,categorys,description,publish_year,book_language,modified_on,id);
			System.out.println("book id:"+book_id);
			if(book_id>0)
			{
				System.out.println("Updated");
				response.sendRedirect("./viewbook.jsp");
				}
			else {
				System.out.println("Not udated");
			}
		}
		catch(Exception e){
			System.out.println("hii");
		}
		
				//userBean user=new loginDAO().checkLogin(email, password);
		
		
		
		
		
		
		
		
	}
		
	}


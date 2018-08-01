package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Employee;
import service.search;

/**
 * Servlet implementation class employeeServlet
 */
@WebServlet("/employeeServlet")
public class employeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public employeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("empname");
		String designation=request.getParameter("designation");
		search s=new search();
		Employee e=s.fetch(name,designation);
		if(e==null) {
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
		if(e.getEmpid()!=0) {
			request.setAttribute("empid",e.getEmpid());
			request.setAttribute("empname",e.getEmpname());
			request.setAttribute("des",e.getDesignation());
			request.setAttribute("contact",e.getContactnum());
			request.getRequestDispatcher("fetchemployeedetails.jsp").forward(request, response);
		}
		else
			response.sendRedirect("error.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

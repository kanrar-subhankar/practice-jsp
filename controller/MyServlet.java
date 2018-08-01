package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.salary;
import service.service;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub	
		
		int id=Integer.parseInt(request.getParameter("empid"));
		long year=Long.parseLong(request.getParameter("financialyear"));
		String month=request.getParameter("month");
		int basicpay=Integer.parseInt(request.getParameter("basicpay"));
		int performancepay=Integer.parseInt(request.getParameter("performancepay"));
		int incometax=Integer.parseInt(request.getParameter("incometax"));
		int foodcoupon=Integer.parseInt(request.getParameter("foodcoupon"));
		int totalsalary=Integer.parseInt(request.getParameter("totalsalary"));
		salary s=new salary(id,year,month,basicpay,performancepay,incometax,foodcoupon,totalsalary);
		service c=new service();
		if(c.comeDAO(s)) {
			RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
			rd.forward(request,response);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
			rd.forward(request,response);
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

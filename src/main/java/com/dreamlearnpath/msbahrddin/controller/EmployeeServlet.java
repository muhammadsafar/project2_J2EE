package com.dreamlearnpath.msbahrddin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dreamlearnpath.msbahrddin.dao.EmployeeDao;
import com.dreamlearnpath.msbahrddin.model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/save")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeDao dao = new EmployeeDao();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/views/form.jsp");
		disp.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String nip = request.getParameter("nip");
		String age = request.getParameter("age");

		Employee emp = new Employee();
		emp.setName(name);
		emp.setNip(nip);
		emp.setAge(Integer.parseInt(age));

		try {
			dao.saveEmployee(emp);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/views/ListEmployee.jsp");
		disp.forward(request, response);

	}

}

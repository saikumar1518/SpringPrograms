package com.createiq.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.dao.EmployeeDaoImpl;
import com.createiq.model.Employee;

public class EmpFindAllController extends HttpServlet {
		private static final long serialVersionUID = 1L;

		private static EmployeeDaoImpl daoImpl = new EmployeeDaoImpl();

		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			// TODO Auto-generated method stub
//			PrintWriter out = response.getWriter();

//			List<Employee> employees = daoImpl.findAll();
//		RequestDispatcher requestDispatcher=	request.getRequestDispatcher("findall.jsp");
//			request.setAttribute("employees", employees);
//			requestDispatcher.forward(request, response);

			
			List<Employee> employees = daoImpl.findAll();
			request.setAttribute("empAll", employees);
			request.getRequestDispatcher("/findall.jsp").forward(request, response);
		}

	}



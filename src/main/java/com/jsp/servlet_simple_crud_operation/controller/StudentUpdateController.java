package com.jsp.servlet_simple_crud_operation.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.servlet_simple_crud_operation.dao.StudentDao;
import com.jsp.servlet_simple_crud_operation.dto.Student;

@WebServlet(value = "/update")
public class StudentUpdateController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		long phone=Long.parseLong(req.getParameter("phone"));
		String gender=req.getParameter("gender");
		Student student=new Student(id,name,email,phone,gender);
		StudentDao studentDao=new StudentDao();
		studentDao.updateStudentDao(student);
		req.getRequestDispatcher("display.jsp").forward(req, resp);
	}

}

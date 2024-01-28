package com.jsp.servlet_simple_crud_operation.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.jsp.servlet_simple_crud_operation.dto.Student;
import com.jsp.servlet_simple_crud_operation.service.StudentService;

public class StudentController implements Servlet {
	
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
		StudentService studentService=new StudentService();
		Student student=null;
//		
//		while(true) {
//			System.out.println("Enter your choice");
//			System.out.println("1. Insert");
//			System.out.println("2. Delete");
//			System.out.println("3 Display All Student");
//			int choice=s.nextInt();
//			switch (choice) {
//			case 1:
//				System.out.println("Enter id");
//				int id=s.nextInt();
//				System.out.println("Enter Name");
//				String name=s.next();
//				System.out.println("Enter email");
//				String email=s.next();
//				System.out.println("Enter phone number");
//				long phone=s.nextLong();
//				System.out.println("Enter gender");
//				String gender=s.next();
//				student=new Student(id,name,email,phone,gender);
//				studentService.saveStudentService(student);
//				break;
//				
//			case 2:
//				System.out.println("Enter id to delete");
//				int deleteId=s.nextInt();
//				studentService.deleteStudentService(deleteId);
//				break;
//				
//			case 3:
//				List<Student> students1=studentService.getAllStudentService();
//				if(students1 != null) {
//					System.out.println(students1);
//				}else {
//					System.out.println("data is not present");
//				}
//				break;
//
//			default:
//				break;
//			}
//		}
//		
//	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		long phone=Long.parseLong(req.getParameter("phone"));
		String gender=req.getParameter("gender");
		student=new Student(id,name,email,phone,gender);
		studentService.saveStudentService(student);
		
		PrintWriter printWriter=res.getWriter();
		printWriter.write("<html><body><h4>Student Registered</h4></body></html>");
		RequestDispatcher rs=req.getRequestDispatcher("student_from.jsp");
		rs.include(req, res);
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}

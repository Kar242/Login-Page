package com.jsp.servlet_simple_crud_operation.service;

import java.util.List;

import com.jsp.servlet_simple_crud_operation.dao.StudentDao;
import com.jsp.servlet_simple_crud_operation.dto.Student;

public class StudentService {
	StudentDao studentDao=new StudentDao();
	
	public Student saveStudentService(Student student) {
		return studentDao.saveStudentdao(student);
	}
	
	public List<Student> getAllStudentService(){
		return studentDao.getAllStudentDao();
	}
	
	public Student deleteStudentService(int deleteId) {
		return studentDao.deleteStudentDao(deleteId);
	}
}

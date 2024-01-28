package com.jsp.servlet_simple_crud_operation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.servlet_simple_crud_operation.connection.Student_Connection;
import com.jsp.servlet_simple_crud_operation.dto.Student;

public class StudentDao {

	Connection connection = Student_Connection.getStudentConnection();

	public Student saveStudentdao(Student student) {
		String insertQuerry = "insert into student values(?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuerry);
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getEmail());
			preparedStatement.setLong(4, student.getPhone());
			preparedStatement.setString(5, student.getGender());
			preparedStatement.execute();
			System.out.println("data Stored");
			return student;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
	public List<Student> getAllStudentDao(){
		String selectQuerry="select * from Student";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(selectQuerry);
			ResultSet resultSet=preparedStatement.executeQuery();
			List<Student> students=new ArrayList<Student>();
			while(resultSet.next()) {
				int id=resultSet.getInt("id");
				String name=resultSet.getString("name");
				String email=resultSet.getString("email");
				long phone=resultSet.getLong("phone");
				String gender=resultSet.getString("gender");
				Student student=new Student(id,name,email,phone,gender);
				students.add(student);
			}
			return students;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	public Student deleteStudentDao(int deleteId) {
		String deleteQuerry="delete from student where id=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(deleteQuerry);
			preparedStatement.setInt(1, deleteId);
			int n=preparedStatement.executeUpdate();
			if(n==1) {
				System.out.println("Data Deleted");
			}else {
				System.out.println("Id not found");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	public Student getStudentById(int sid) {
		String selectQuerry="select * from student where id=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(selectQuerry);
			preparedStatement.setInt(1, sid);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				int id=resultSet.getInt("id");
				String name=resultSet.getString("name");
				String email=resultSet.getString("email");
				long phone=resultSet.getLong("phone");
				String gender=resultSet.getString("gender");
				return new Student(id,name,email,phone,gender);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	

	public Student updateStudentDao(Student student) {
		String updateQuerry="update student set name=?,email=?,phone=?,gender=? where id=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(updateQuerry);
			preparedStatement.setString(1, student.getName());
			preparedStatement.setString(2, student.getEmail());
			preparedStatement.setLong(3, student.getPhone());
			preparedStatement.setString(4, student.getGender());
			preparedStatement.setInt(5, student.getId());
			int n=preparedStatement.executeUpdate();
			return student;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}

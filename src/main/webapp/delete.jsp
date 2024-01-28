<%@page import="java.awt.DisplayMode"%>
<%@page import="com.jsp.servlet_simple_crud_operation.dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int id=Integer.parseInt(request.getParameter("id"));
		StudentDao studentDao=new StudentDao();
		studentDao.deleteStudentDao(id);
		response.sendRedirect("display.jsp");
	%>

</body>
</html>
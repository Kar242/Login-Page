<%@page import="com.jsp.servlet_simple_crud_operation.dto.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.servlet_simple_crud_operation.service.StudentService"%>
<%@page import="com.jsp.servlet_simple_crud_operation.dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
	th {
	margin: 80px auto;
	padding: 65px ;
	font-size: 17px
	bgcolor: red;
	}
	
	a{
	color: white;
	text-decoration:none
	}
	
	td {
		text-align: center;
		background-color:red; color:white;
	}
	
	.button-85 {
  padding: 0.6em 2em;
  border: none;
  outline: none;
  color: rgb(255, 255, 255);
  background: #111;
  cursor: pointer;
  position: relative;
  z-index: 0;
  border-radius: 10px;
  user-select: none;
  -webkit-user-select: none;
  touch-action: manipulation;
}

.button-85:before {
  content: "";
  background: linear-gradient(
    45deg,
    #ff0000,
    #ff7300,
    #fffb00,
    #48ff00,
    #00ffd5,
    #002bff,
    #7a00ff,
    #ff00c8,
    #ff0000
  );
  position: absolute;
  top: -2px;
  left: -2px;
  background-size: 400%;
  z-index: -1;
  filter: blur(5px);
  -webkit-filter: blur(5px);
  width: calc(100% + 4px);
  height: calc(100% + 4px);
  animation: glowing-button-85 20s linear infinite;
  transition: opacity 0.3s ease-in-out;
  border-radius: 10px;
}

@keyframes glowing-button-85 {
  0% {
    background-position: 0 0;
  }
  50% {
    background-position: 400% 0;
  }
  100% {
    background-position: 0 0;
  }
}

.button-85:after {
  z-index: -1;
  content: "";
  position: absolute;
  width: 100%;
  height: 100%;
  background: #222;
  left: 0;
  top: 0;
  border-radius: 10px;
}

</style>
<body>
	
	<%
		StudentDao studentDao=new StudentDao();
		StudentService studentService=new StudentService();
		List<Student> students=studentDao.getAllStudentDao();
	%>
	<H1 style="color: red">Welcome to Student Detail Page</H1>
	<table border="">
		<tr bgcolor="green">
			<th>id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Gender</th>
			<th>EDIT</th>
			<th>DELETE</th>	
		</tr>
		<%for(Student student:students){%>
		<tr>
			<td><%=student.getId()%></td>
			<td><%=student.getName()%></td>
			<td><%=student.getEmail() %></td>
			<td><%=student.getPhone() %></td>
			<td><%=student.getGender() %></td>
			<td><button class="button-85" role="button"><a href="edit.jsp?id=<%=student.getId()%>">EDIT</a></button></td>
			<td><button class="button-85" role="button"><a href="delete.jsp?id=<%=student.getId()%>">DELETE</a></button></td>
			
		<tr>
		<%}%>
	</table>

</body>
</html>
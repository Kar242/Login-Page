<%@page import="com.jsp.servlet_simple_crud_operation.dto.Student"%>
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
	form{
	background-color: lightGray;
	text-align: center;
	}
    
    fieldset{
     background-color: blanchedalmond;
     height: 450px;
     width: 400px;
     margin: 130px auto;
    }
     h2{
         text-align: center;
     }
    
    
 </style> 
<body>

	<%int id=Integer.parseInt(request.getParameter("id"));
		String name1=request.getParameter("name");
		StudentDao studentDao=new StudentDao();
		Student student2=studentDao.getStudentById(id);%>

	<form action="update" method="post">
        <h2>Updated form</h2>
        <fieldset>
            ID <span><input type="text" autofocus name="id" value=<%=id %>></span><br><br>
            Name <span><input type="text" name="name" value=<%=student2.getName() %>></span> <br><br>
            Email <input type="email" name="email" value=<%=student2.getEmail() %>><br><br>
            Phone No <input type="tel" name="phone" value=<%=student2.getPhone() %>><br><br>
            Gender <br><br>
            <input type="radio" name="gender" value="Male" <%if(student2.getGender().equalsIgnoreCase("male")){ %> checked="checked" <%} %>> Male
            <input type="radio" name="gender" value="Female" <%if(student2.getGender().equalsIgnoreCase("female")){ %> checked="checked" <%} %>> Female
            <input type="radio" name="gender" value="Other" <%if(student2.getGender().equalsIgnoreCase("other")){ %> checked="checked" <%} %> > Others
           <br><br>

            <input type="submit" value="Update" name="Update">
            <input type="reset" value="Reset" name="reset">

            
        </fieldset>
        
    </form>

</body>
</html>
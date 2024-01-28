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

	<form action="information">
        <h2>Registration form</h2>
        <fieldset>
            ID <span><input type="text" autofocus name="id"></span><br><br>
            Name <span><input type="text" name="name"></span> <br><br>
            Email <input type="email" name="email"><br><br>
            Phone No <input type="tel" name="phone"><br><br>
            Gender <br><br>
            <input type="radio" name="gender" value="Male"> Male
            <input type="radio" name="gender" value="Female"> Female
            <input type="radio" name="gender" value="Others" > Others
           <br><br>

            <input type="submit" value="Submit" name="submit">
            <input type="reset" value="Reset" name="reset">

            
        </fieldset>
        
    </form>

</body>
</html>
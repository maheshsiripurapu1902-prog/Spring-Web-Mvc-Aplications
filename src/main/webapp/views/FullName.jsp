<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="/FullNameResult" method="post">

<label>Enter Fname  :: ${fname}</label>
<br> <br>
<input type="text" name="fname" required="required">
<br> <br>

<label>Enter a Lname :: ${lname}</label>
<br> <br>
<input type="text" name="lname" required="required">
<br> <br>
<input type="submit" value="PrintFullName">
<input type="reset" value="Reset">
<h1>Result :: ${fullname}</h1>

</form>
</body>
</html>
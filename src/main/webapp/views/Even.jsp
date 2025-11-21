<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/EvenResult" method="post">

<label>Enter a Number  :: ${num1}</label>
<br> <br>
<input type="text" name="num1" required="required">
<br> <br>
<input type="submit" value="PrintEvenOrOdd">
<input type="reset" value="Reset">

<br> <br>
<h1>Result:: ${result}</h1>
</form>

</body>
</html>
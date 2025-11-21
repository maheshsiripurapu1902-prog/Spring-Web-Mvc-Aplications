<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/BiggestResult" method="post">

<label>Enter a Num1:: ${num1}</label>
<br> <br>
<input type="text" name="num1" required="required">
<br> <br>

<label>Enter a Num2:: ${num2}</label>
<br> <br>
<input type="text" name="num2" required="required">
<br> <br>
<label>Enter a Num3::  ${num3}</label>
<br> <br>
<input type="text" name="num3" required="required">
<br> <br>

<input type="submit" value="Print a Biggest Number">
<input type="reset" value="Reset">

<h2>Result :: ${result}</h2>

</form>

</body>
</html>
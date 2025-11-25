<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<form action="/StudentResult" method="post">

<label>Enter a Id :: </label>
<br> <br>

<input type="text" name="id" required="required">
<br> <br>
<label>First Name :: </label>
<br> <br>

<input type="text" name="fname" required="required">
<br> <br>
<label>LastName :: </label>
<br> <br>

<input type="text" name="lname" required="required">
<br> <br>

<label>java :: </label>
<br> <br>

<input type="text" name="java" required="required">
<br> <br>

<label>Spring :: </label>
<br> <br>

<input type="text" name="spring" required="required">
<br> <br>

<label>hibernate :: </label>
<br> <br>

<input type="text" name="hibernate" required="required">
<br> <br>
<label>javascript</label>
<br> <br>

<input type="text" name="javascript" required="required">
<br> <br>





<input type="submit" value="print Student Marks">
<input type="reset" value="Reset">


</form>
<br>

<table border="1">

<tr>

<th>id</th>
<th>Full Name</th>

<th>java</th>
<th>spring</th>
<th>hibernate</th>
<th>javascript</th>
<th>Total</th>
<th>precentage</th>

<th>Grade</th>
</tr>


<tr>

<td>${id}</td>
<td>${fullname}</td>
<td>${java}</td>
<td>${spring}</td>
<td>${hibernate}</td>
<td>${javascript}</td>

<td>${total}</td>
<td>${precentage}</td>
<td>${grade}</td>


</tr>

</table>

</body>
</html>
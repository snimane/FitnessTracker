<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>


<tr>
<td></td> 
<td>Minutes</td>
</tr>
<c:forEach items="${goals}" var="goal"> 


<tr>
<td >${goal.id}</td> 

<td>${goal.minutes}</td>
<td>
<table>

<tr>
<th>Exercise ID</th><th>Exercice Minutes</th><th>Exercise Activity</th>

</tr>
<c:forEach items="${goal.exercices}" var ="exercise">
<tr>
<td>${exercise.id}</td><td>${exercise.minutes}</td><td>${ exercise.activity}</td>

</tr>
</c:forEach>
</table>
</td>

</tr>
</c:forEach>
</table>

</body>
</html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Clicker</title>
</head>


<body>

<div id="container">
		<a href="/Button_Clicker/ButtonClicker"><button>Click Me!</button></a>
		<h1>
			You have clicked the button
			<c:out value="${count}" />
			time(s)!
		</h1>
	</div>

</body>
</html>
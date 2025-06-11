<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<body>
		<%
			Object currentLoggedInUser = session.getAttribute("loggedInUser");
		%>
		
		<h1>
			Hi <%=currentLoggedInUser %>
		</h1>
		
		<h1 style="background-color: green; color: white">
			Welcome to our website!!
		</h1>
	</body>
</html>
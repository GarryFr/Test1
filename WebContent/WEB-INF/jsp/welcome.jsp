<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>Welcome page</title>
</head>
<body>
	<form action="students" method="post">
		<p>
			<b>Students</b>
		</p>
		<p> <input name="students" type="radio" value="createStudent"> Enroll student</p>
		<p> <input name="students" type="radio" value="readStudent"> Choose students</p>
		<p> <input name="students" type="radio" value="updateStudent"> Update student</p>
		<p> <input name="students" type="radio" value="deleteStudent"> Delete student</p>
		
		<p> <input type="submit" value="Choose"></p>
	</form>
</body>
</html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lesson</title>
</head>
<body>

<h2>Lessons</h2>
   <table border="1" cellspacing="2" cellpadding="3">
   <tr>
        <td>Lesson</td>
        <td>Classroom</td>
        <td>Group</td>
        <td>Teacher</td>
        <td>Date</td>
   </tr>
   <c:forEach items="${lessons}" var="lesson">
     <tr>
        <td> <c:out value="${lesson.lesson}"/></td>
        <td> <c:out value="${lesson.classroom.number}"/></td>
        <td> <c:out value="${lesson.group.number}"/></td>
        <td> <c:out value="${lesson.teacher.name}"/></td>
        <td> <c:out value="${lesson.date}"/></td>       
    </tr>
    </c:forEach>
</table>  
</body>
</html>
<%@ page contentType="text/html; charset=utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Students</title>
</head>
<body>

<h3>Students</h3>
 <table border="1" cellspacing="2" cellpadding="3" align="left">
  <c:forEach items="${students}" var="student">
    <tr>
      <td><c:out value="${student.id}" /></td>
      <td><c:out value="${student.name}" /></td>
      <td><c:out value="${student.group.number}" /></td>
    </tr>
  </c:forEach>
</table> 
</body>
</html>
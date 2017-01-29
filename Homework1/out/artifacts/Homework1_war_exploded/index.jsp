<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
  <title>Title</title>
</head>
<body>
<p>The value comes from servlet is : <b> <c:out value="${result}"/></b></p>

<form method="post" action="/login"> Log in <br>
  <input type="text" name="username" required>
  <input type="password" name="password" required>
  <input type="submit" value="Login">
</form>


</body>
</html>

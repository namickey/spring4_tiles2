<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML>
<head>
    <title>Shop Regist</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<form:form modelAttribute="registForm" action="regist/regist">
    <form:input path="name" />
    <button type="submit" name="regist">regist</button>
</form:form>
</body>
</html>

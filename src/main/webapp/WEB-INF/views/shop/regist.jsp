<%@ page contentType="text/html; charset=Shift_JIS" pageEncoding="Shift_JIS" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS" />
</head>
<form:form modelAttribute="registShopForm" action="regist">
<dl>
  <dt>Shop名</dt>
  <dd>
    <form:input path="shopName" />
    <form:errors path="*"/><br/>
  </dd>
</dl>
<button type="submit">登録あ</button>
</form:form>

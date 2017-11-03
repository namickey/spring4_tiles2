<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form modelAttribute="registShopForm">
<dl>
  <dt>Shop名</dt>
  <dd>
    <form:input path="shopName" />
    <form:errors path="*"/><br/>
  </dd>
</dl>
<button type="submit" name="ge">登録</button>
</form:form>

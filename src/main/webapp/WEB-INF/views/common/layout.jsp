<%@ page contentType="text/html; charset=Shift_JIS" pageEncoding="Shift_JIS" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE html>
<html>
<head>
    <title><tiles:insertAttribute name="title" ignore="true" /></title>
    <meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS" />
</head>
<body>
<tiles:insertAttribute name="top" />
<tiles:insertAttribute name="body" />
</body>
</html>
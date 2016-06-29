<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: kshitzgupta
  Date: 5/5/16
  Time: 11:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ include file="/common/tagLibs.jsp"%>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add City</title>
</head>
<body>
Welcome. Add City

<s:form action="saveCity">
    <s:textfield key="City" name="city.name" />
    <s:textfield key="State" name="city.state" />
    <input type="submit" value="Submit"/>
</s:form>
</body>
</html>

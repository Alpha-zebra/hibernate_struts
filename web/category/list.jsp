<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-06-03
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>List category</title>
</head>
<body>
<%@include file="../include/navigator.jsp"%>
<table align="center" border="1" cellspacing="0" width="500px">

    <tr>
        <td>id</td>
        <td>name</td>
        <td>products</td>
        <td>edit</td>
        <td>delete</td>
    </tr>

    <s:iterator value="categorys" var="p">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td><a href="listProduct?category.id=${p.id}">products</a></td>
            <td><a href="editCategory?category.id=${p.id}">edit</a></td>
            <td><a href="deleteCategory?category.id=${p.id}">delete</a></td>
        </tr>
    </s:iterator>
</table>

<br/>

<form action="addCategory" method="post">
    <table align="center" border="1" cellspacing="0">
        <tr>
            <td>
                name:
            </td>
            <td>
                <input type="text" name="category.name" value="">
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="submit">
            </td>
        </tr>
    </table>

</form>

</body>

</body>
</html>

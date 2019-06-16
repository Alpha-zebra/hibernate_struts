<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-06-02
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>List Product</title>
</head>
<style>
    table{
        border: 1px solid dodgerblue;
        mso-cellspacing: 0px;
    }
    td{
        /*background-color: lightskyblue;*/
        background-image: linear-gradient(bottom,lightskyblue,lightblue);
    }
</style>
<body>
<%@include file="../include/navigator.jsp" %>
<table align="center" width="500px">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>price</td>
        <td>category</td>
        <td>edit</td>
        <td>delete</td>
    </tr>
    <s:iterator value="products" var="p">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${p.price}</td>
            <td>${p.category.name}</td>
            <td><a href="editProduct?product.id=${p.id}">edit</a> </td>
            <td><a href="deleteProduct?product.id=${p.id}">delete</a> </td>
        </tr>
    </s:iterator>
</table>
<br/>
<form action="addProduct" method="post">
    <table align="center">
        <s:select list="categorys"
        listKey="id"
        listValue="name"
        multiple="false"
        label="categoried"
        name="product.category.id"/>
        <tr>
            <td>name:</td>
            <td>
                <input type="text" name="product.name" value="">
            </td>
        </tr>
        <tr>
            <td>price:</td>
            <td>
                <input type="number" name="product.price" value="0">
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
</html>

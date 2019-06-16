<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-06-02
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Edit Product</title>
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
<form action="updateProduct" method="post">
    <table align="center" cellspacing="0">
        <s:select list="categorys"
        listKey="id"
        listValue="name"
        multiple="false"
        value="product.category.id"
        label="categories"
        name="product.category.id"/>

        <tr>
            <td>name:</td>
            <td>
                <input type="text" name="product.name" value="${product.name}">
            </td>
        </tr>
        <tr>
            <td>price:</td>
            <td>
                <input type="number" name="product.price" value="${product.price}">
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="hidden" name="product.id" value="${product.id}">
                <input type="submit" value="submit"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>

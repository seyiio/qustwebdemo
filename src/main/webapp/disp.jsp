<%--
  Created by IntelliJ IDEA.
  User: fk
  Date: 2023/3/23
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <style>
        .pure-table {
            border-collapse: collapse;border-spacing: 0;
            empty-cells: show;
            border: 1px solid #cbcbcb;
        }
        .pure-table td .pure-table th {
            border:1px solid #cbcbcb;
            border-width: 1px;
            margin: 0;
            overflow: visible;padding: .5em 1em;
        }
    </style>
        <title>Title</title>
</head>
<body>
<table class="pure-table">
    <thead>
    <tr>
        <th>学号</th><th>姓名</th><th>年龄</th></tr>
    </thead><tbody>
<c:forEach var="stu" items="${students}">
    <tr>
        <td>${stu.sno}</td><td>${stu.sname}</td><td>${stu.age}</td></tr>
</c:forEach></tbody></table>

</body>
</html>

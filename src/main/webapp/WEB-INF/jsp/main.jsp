<%--
  Created by IntelliJ IDEA.
  User: JBOOM
  Date: 2021-06-19
  Time: 오전 1:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
여기부터 메인입니다.

<table>
    <tr>
        <td>CODE_GROUP_ID</td>
        <td>CODE_GROUP_NAME</td>
        <td>CODE_GROUP_DESC</td>
        <td>LAST_UPDATE_DTIME</td>
        <td>LAST_UPDATE_USER_ID</td>
    </tr>
    <tbody>
    <c:forEach var="data" items="${codeGroup}">
    <tr>
        <td>${data.codeGroupId}</td>
        <td>${data.codeGroupName}</td>
        <td>${data.codeGroupDesc}</td>
        <td>${data.lastUpdateDtime}</td>
        <td>${data.lastUpdateUserId}</td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>

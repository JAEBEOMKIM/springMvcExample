<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>제목</title>
</head>
<body>
<div class="head">
<tiles:insertAttribute name="header" />
</div>
<div class="contents">
<tiles:insertAttribute name="body"/>
</div>
</body>
</html>
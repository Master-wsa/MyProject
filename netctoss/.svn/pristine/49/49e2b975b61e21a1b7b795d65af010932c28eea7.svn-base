<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<div id="navi">
        <ul id="menu">
            <li><a href="${pageContext.request.contextPath}/role/rediectIndex.do"  class="index_off"></a></li>
            <c:forEach items="${adm.lp}" var="power">
            	<li><a href="${pageContext.request.contextPath}${power.pow_url}" id="headClass${power.pow_id}" class="${power.pow_class}"></a></li>
            </c:forEach>
        </ul>
    </div>
</body>
</html>
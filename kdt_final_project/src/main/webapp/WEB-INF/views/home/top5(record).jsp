<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 화면</title>
<script src="/js/jquery-3.6.4.min.js"></script>

<link rel="stylesheet" href="/css/home/top5(record).css">
</head>

<body>

<div id="top5_record" >
<c:forEach items="${getTop5Record}" var="board">
  <div id="to">
    <h4>${board.title }</h4>
    <p>${board.contents }
    <span>
      ${board.writer }
    </span>
  </div>

</c:forEach>
</div>

</body>
</html>
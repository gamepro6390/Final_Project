<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>여행지 추천 메뉴</title>
<script src="http://localhost:8099/js/jquery-3.6.4.min.js"></script>
<script src="http://localhost:8099/js/travelspot_main.js"></script>

<link href="/css/import.css" rel="stylesheet"/>

</head>
<body>
<jsp:include page="../views/header.jsp" />

<!-- https://dogcowking.tistory.com/326 -->
<div class="titlebox font_title">가고 싶은 여행지를 선택해주세요</div>

<!-- 3개씩 배치 -->
<div class="regionContainer">
 <div class="regionItem">
  <p class="font_content regionName" id="32">강원</p>
 	<div class="box" id="32">
   		<img class="profile" src="/img/gangwon.jpg">
  	</div>
  </div>
  <div class="regionItem">
  <p class="font_content regionName" id="6">부산</p>
 	<div class="box" id="6">
   		<img class="profile" src="/img/busan.jpg">
  	</div>
  </div>
  <div class="regionItem">
  <p class="font_content regionName" id="2">인천</p>
 	<div class="box" id="2">
   		<img class="profile" src="../img/incheon.jpg">
  	</div>
  </div>
  <div class="regionItem">
  <p class="font_content regionName" id="jeju">제주도</p>
 	<div class="box" id="jeju">
   		<img class="profile" src="/img/jeju.jpg">
  	</div>
  </div>
  <div class="regionItem">
  <p class="font_content regionName" id="jeonnam">전라남도</p>
 	<div class="box" id="jeonnam">
   		<img class="profile" src="/img/jeonnam.jpg">
  	</div>
  </div>
  <div class="regionItem">
  <p class="font_content regionName" id="gyeongnam">경상남도</p>
 	<div class="box" id="gyeongnam">
   		<img class="profile" src="/img/gyeongnam.jpg">
  	</div>
  </div>
</div>



</body>
</html>
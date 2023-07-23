<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="css/FAQ/main.css">
<!--   <link rel="stylesheet" type = "text/css" href="css/FAQ/reset.css"> -->
</head>
<body>
	<!-- header -->
	<%@ include file="../home/header.jsp"%>

	<main>
		<div class="section-container">

			<div class="left-section">
				<!-- 왼쪽 섹션 -->
				<h2>문의 분류</h2>
				<br>
				<ul class="category-list">
					<li><a href="/FAQ01">일반</a></li>
					<li><a href="/FAQ02">가입 변경/탈퇴</a></li>
					<li><a href="/FAQ03">신고/이용제한</a></li>
					<li><a href="/FAQ04">프로필 관련</a></li>
					<li><a href="/selectFAQs">이용 문의</a></li>
				</ul>
			</div>

			<div class="right-section">
				<!-- 오른쪽 섹션 -->
				<h2>문의글 작성 양식</h2>
				<br>

				<div class="form-group">
					<form action="/updateFAQ" method="post">
						<input type="hidden" name="id" value="${faq.id}" /> <label
							for="categories">문의 분류</label>
						<textarea id="categories" class="form-control-category"
							name="categories">
						${faq.categories}
						</textarea>



						<label for="title">제목</label>
						<textarea class="form-control" id="title" name="title">{faq.title}</textarea>



						<label for="title">문의 내용</label>
						<textarea class="form-control-textarea"  id="contents"
							name="contents">${faq.contents}</textarea>



						<br> <input type="button" value="문의접수" onclick="updateFAQ()">
					</form>
				</div>
			</div>
		</div>
		<script>

			function updateFAQ() {
			    // 폼 요소의 값들을 JavaScript 변수에 저장합니다.
			    var categories = document.getElementById("categories").value;
			    var title = document.getElementById("title").value;
			    var contents = document.getElementById("contents").value;
			    var id = "${faq.id}"; // JSP 코드로부터 FAQ의 ID를 가져옵니다.

			    // 폼 데이터 객체를 생성합니다.
			    var formData = new FormData();
			    formData.append("id", id);
			    formData.append("categories", categories);
			    formData.append("title", title);
			    formData.append("contents", contents);
);
			}

</script>
	</main>

	<!-- top button -->
	<%@ include file="../home/topbutton.jsp"%>

	<!-- footer -->
	<%@ include file="../home/footer.jsp"%>



</body>
</html>
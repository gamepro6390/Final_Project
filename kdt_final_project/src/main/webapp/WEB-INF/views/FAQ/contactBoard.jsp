<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>문의 게시판</title>

<link rel="stylesheet" type="text/css" href="css/FAQ/main2.css">

</head>
<body>
	<header>
		<%@ include file="../home/header.jsp"%>
	</header>
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
			<h2>이용 문의</h2>

			<div class="tablearea">
				<table>
					<tr>
						<th id="title">제목</th>
						<th>내용</th>
						<th>작성시간</th>
						<th>작성자</th>
						<th>분류</th>
					</tr>
					<c:forEach items="${boardList}" var="dto">
						<tr>

							<td><a href="/detailForm?id=${dto.id }">${dto.title}</a></td>
							<td>${dto.contents}</td>
							<td>${dto.writingtime}</td>
							<td>${dto.writer}</td>
							<td>${dto.categories}</td>
							<td>
								<a href="/updateForm?id=${dto.id }">수정</a>
							</td>
							<td>
								<button onclick="deleteArticle(${dto.id})">삭제</button>
							</td>
							<%-- 						<td><c:out value="${dto.imageFileName}"/></td> --%>

						</tr>
					</c:forEach>
				</table>

				<div class="faqbtn">
					<a href="/FAQ"><h2>문의 작성</h2></a>
				</div>


			</div>
		</div>

	</div>

	<!-- top button -->
	<%@ include file="../home/topbutton.jsp"%>

	<!-- footer -->
	<%@ include file="../home/footer.jsp"%>

</body>

<!-- JavaScript -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

<script>
	function toggleContents() {
		// 해당 행의 "내용" 부분을 가져옴
		var contentRow = event.target.parentElement.nextElementSibling;
		// "내용" 부분을 토글(Toggle)하여 보이거나 숨김
		if (contentRow.style.display === "none") {
			contentRow.style.display = "table-row";
		} else {
			contentRow.style.display = "none";
		}
	}
</script>
<script>
    // JavaScript 함수를 통해 게시물 삭제 요청 전송
    function deleteArticle(id) {
        if (confirm("정말로 삭제하시겠습니까?")) {
            // AJAX를 사용하여 서버로 삭제 요청 전송
            $.ajax({
                url: '/deleteArticle',
                method: 'POST',
                data: {id: id},
                success: function (response) {
                    // 성공적으로 삭제됐을 때 처리할 내용
                    alert('게시물이 삭제되었습니다.');
                    window.location.reload(); 
                    window.location.href = "/selectFAQs";
                    // 필요한 경우 삭제 후 추가적인 작업을 수행할 수 있습니다.
                },
                error: function (error) {
                    // 삭제 요청 실패 또는 오류 발생 시 처리할 내용
                    alert('게시물 삭제에 실패했습니다. 다시 시도해주세요.');
                    // 필요한 경우 에러 처리를 위한 추가적인 작업을 수행할 수 있습니다.
                }
            });
        }
    }
</script>

</html>

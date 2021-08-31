<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Index</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			function goSave(){
				document.bookForm.submit();
			}
		</script>
	</head>
	<body>
		<h2>Index 페이지입니다.</h2>
		<form action="/bookDetail" method="post" name="bookForm">
			<label>저자 : </label>
			<input type="text" name="author" id="author"><br>
			<label>검색어 : </label>
			<input type="text" name="search" id="search"><br>
			<input type="button" value="확인" onclick="goSave()">
			<input type="button" value="취소">
		</form>
	</body>
</html>
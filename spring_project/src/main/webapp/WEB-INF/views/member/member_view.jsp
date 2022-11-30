<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!-- 첫 페이지 uri주소 값  -->
<h2> 회원 상세 보기 </h2>
<form name="form1" method="post">
* 아이디 : <input type="text" name="userId" value="${dto.userId}" readonly><br>
* 비밀번호 : <input type="text" name="userPw" value="${dto.userPw}"><br>
* 이름 : <input type="text" name="userName" value="${dto.userName}"><br>
* 이메일 : <input type="text" name="userEmail" value="${dto.userEmail}"><br>
* 가입날자 : <input type="text" name="userRegdate" value="${dto.userRegdate}"></br>
* 수정날자 : <input type="text" name="userUpdatedate" value="${dto.userUpdatedate}"></br>
<input type="button" value="수정" id="btnUpdate">
<input type="button" value="삭제" id="btnDelete">
</form>


</body>
</html>
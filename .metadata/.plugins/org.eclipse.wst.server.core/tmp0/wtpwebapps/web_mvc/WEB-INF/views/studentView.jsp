<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3> 실행 결과 </h3>
이름 : ${info.name}
나이 : ${info.age}
학년 : ${info.gradeNum}
반 : ${info.classNum}
<hr>
<%=request.getParameter("name")%>
</body>
</html>
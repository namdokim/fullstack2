<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    	//스크립틀릿을 이용해서 리퀘스트 겟어트리부트로 해서 가져올수 있다 
    	// 그후 스크립틀릿에 =를 이용해서 값을 불러올수 있다 
    	// 나는 배열로 해서 없지만 일반적으로 하면은 컨트롤러에서 모델에 각각의 값들을 다 넣어서 ${}활용해서 가져오던지 리퀘스트해서 가지고 와야 된다 
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${arr}
	<h1> EX01 sample.do</h1>
	<div>반가워요 잘 가요</div>
	<form action="sample.do" method="post">
	이름 : <input type="text" name="name" id="name">
	나이 : <input type="text" name="age" id="age">
	주소 : <input type="text" name="addr" id="addr">
	연락처  : <input type="text" name="phone" id="phone">
	<input type="submit">
	</form>
	
</body>
</html>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% 
	//배열 타입은 List<String>으로 표현 해줘야 한다 
	List<String> list = (List<String>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>list입니다 </h1>
	<h2>list예요</h2>
	<h3>list다</h3>
	<!-- /가 없으면은 현재 보여지고 잇는 경로 기준으로 찾아라 가 된다  -->
	<!-- /가 잇으면은 프로젝트 패스에 바로 뒤에 이어서 붙여준다  -->
	<a href="view.do">view.do로 이동 </a>
	<!-- el를 쓸려면은 jstl를 써서 써야되네  -->	
	<table border="1">
	<c:forEach items="${list }" var="board">
		<tr>
			<td>
				${board}
			</td>
		</tr>
		
	</c:forEach>
	</table>
	<% 
	// for문을 활용 햇을때 항상된 포문을 활용해서 쓴다
	//for(String board : list)
		/* for(int i =0 ; i < list.length; i++)
		{
			String j = list[i];
		} */
	%>
	<!-- 자바 스크립틀릿을 썻을떄  -->
	<table border="1">
		<%
			for(int i=0; i<list.size(); i++)
			{
				String board = list.get(i);
		%>
				
			<tr>
				<td>
				<%= board %>	
				</td>
			</tr>
		<% 
			}		
		%>
	</table>
	
</body>
</html>
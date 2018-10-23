<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--  html注释 -->
	<%-- JSP注释 --%>
	 <br/>
	 <%
	 	String name = "wangzunbin";
	 	Integer age = 18;
	 %>
	 姓名:<%= name %> <br/>年龄:<%=age %><br/> 根据年龄输出一段文字:年龄在18岁以上可以观看
	 <br/>
	 <%
	 	if(age >= 18){
	 %>
	 可以观看
	 <%
	 	} else{
	 %>
	 你太小了~~~~~
	 <%
	 	}
	 %>
	 <%-- 在类中定义成员 --%>
	 <%!
	 	String username;
		 public void doWork(){
			 
		 }
	 %>
	 
	 当前时间: <%=new Date().toLocaleString() %>
	 <jsp:forward page="/"></jsp:forward>
</body>
</html>
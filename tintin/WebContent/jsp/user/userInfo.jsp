<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
	String name=new String(request.getParameter("id").getBytes("iso8859-1"),"utf-8");
	String id=request.getParameter("id");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户信息列表</title>

<script type="text/javascript" src="<%=basePath %>js/jquery1.9.0.min.js"></script>
<script type="text/javascript" src="<%=basePath %>js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(function(){
		$.ajax({
			type:"get",
			url:"<%=basePath %>/user/loginOut.ding",
			data:{name:"<%=name%>"},
			async:true
			});
	});

</script>
</head>
<body>
   <%=id%>,<%=name%>
	<a href="<%=basePath%>jsp/user/userInfo.jsp?id=中文">测试传递中文参数</a>
</body>
</html>
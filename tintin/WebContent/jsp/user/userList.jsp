<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户信息列表</title>
<script type="text/javascript" src="<%=basePath %>js/jquery1.9.0.min.js"></script>
<script type="text/javascript" src="<%=basePath %>js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="<%=basePath %>js/plugins/easyUi/themes/default/easyui.css"/>
	<link rel="stylesheet" type="text/css" href="<%=basePath %>js/plugins/easyUi/themes/icon.css"/>
	<link rel="stylesheet" type="text/css" href="<%=basePath %>js/plugins/easyUi/demo/demo.css"/>
	<script type="text/javascript" src="<%=basePath %>js/plugins/easyUi/jquery.easyui.min.js"></script>
	<script type="">
				
</script>
</head>
<body>
	<h2>Basic DataGrid</h2>
	<p>The DataGrid is created from markup, no JavaScript code needed.</p>
	<div style="margin:20px 0;"></div>
	
	<table class="easyui-datagrid" title="用户列表" style="width:700px;height:250px"
			data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'itemid',width:80">用户ID</th>
				<th data-options="field:'productid',width:100">用户姓名</th>
				<th data-options="field:'listprice',width:80,align:'right'">手机号</th>
				<th data-options="field:'unitcost',width:80,align:'right'">邮箱地址</th>
				<th data-options="field:'attr1',width:100">详情</th>
				<th data-options="field:'status',width:60,align:'center'">操作</th>
			</tr>
		</thead>
	</table>

</body>
</html>
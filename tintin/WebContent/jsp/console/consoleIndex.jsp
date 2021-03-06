<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<title>后台管理系统</title>
	<link rel="stylesheet" type="text/css" href="<%=basePath %>js/plugins/easyUi/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>js/plugins/easyUi/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>js/plugins/easyUi/demo.css">
	<script type="text/javascript" src="<%=basePath %>js/jquery1.9.0.min.js"></script>
	<script type="text/javascript" src="<%=basePath %>js/jquery.easyui.min.js"></script>
</head>
<body>
	<h2>后台管理系统</h2>
	<div style="margin:20px 0;"></div>
	<div class="easyui-layout" style="width:100%;height:900px;">
		<div data-options="region:'north'" style="height:50px">
		</div>
		<div data-options="region:'south',split:true" style="height:50px;">111</div>
		<div data-options="region:'east',split:true" title="East" style="width:250px;">
			<ul class="easyui-tree" data-options="url:'tree_data1.json',method:'get',animate:true,dnd:true"></ul>
		</div>
		<div data-options="region:'west',split:true" title="功能列表" style="width:250px;">
			<div class="easyui-accordion" data-options="fit:true,border:false">
				<div title="用户管理" style="padding:10px;">
					
				</div>
				<div title="Title2" data-options="selected:true" style="padding:10px;">
					
				</div>
				<div title="Title3" style="padding:10px">
					内容4
				</div>
					<div title="Title4" style="padding:10px">
					内容5
				</div>
			</div>
		</div>
		<div data-options="region:'center',title:'Main Title',iconCls:'icon-ok'">
			<div class="easyui-tabs" data-options="fit:true,border:false,plain:true">
				<div title="About" data-options="href:'_content.html'" style="padding:10px"></div>
				<div title="DataGrid" style="padding:5px">
					<table class="easyui-datagrid" data-options="url:'datagrid_data1.json',method:'get',singleSelect:true,fit:true,fitColumns:true">
						<thead>
							<tr>
								<th data-options="field:'itemid'" width="80">Item ID</th>
								<th data-options="field:'productid'" width="100">Product ID</th>
								<th data-options="field:'listprice',align:'right'" width="80">List Price</th>
								<th data-options="field:'unitcost',align:'right'" width="80">Unit Cost</th>
								<th data-options="field:'attr1'" width="150">Attribute</th>
								<th data-options="field:'status',align:'center'" width="50">Status</th>
							</tr>
						</thead>
					</table>
				</div>
				<div title="其他" style="padding:5px">
				
				</div>
			</div>
		</div>
	</div>
</body>
</html>
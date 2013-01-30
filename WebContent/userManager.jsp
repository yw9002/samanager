<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<form id="pagerForm" method="post" action="getUserList.action">
	<input type="hidden" name="status" value="${param.status}">
	<input type="hidden" name="keywords" value="${param.keywords}" />
	<input type="hidden" name="pageNum" value="1" />
	<input type="hidden" name="numPerPage" value="${model.numPerPage}" />
	<input type="hidden" name="orderField" value="${param.orderField}" />
</form>


<div class="pageHeader">
	<form onsubmit="return navTabSearch(this);" action="userSearch.action" method="post">
	<div class="searchBar">
		<table class="searchContent">
			<tr>
				<td>用户名：<input type="text" name="user.username" /></td>
			</tr>
		</table>
		<div class="subBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">检索</button></div></div></li>
			</ul>
		</div>
	</div>
	</form>
</div>
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="addUser.action" target="navTab"><span>添加</span></a></li>
			<li class="line">line</li>
			<li><a class="delete" href="delUser.action?user.uid={sid_user}" target="ajaxTodo" id="deluser" title="确定要删除吗?"><span>删除</span></a></li>
			<li class="line">line</li>
			<li><a class="edit" id="edituser" href="editUser.action?user.uid={sid_user}" target="navTab"><span>修改</span></a></li>
		</ul>
	</div>
	<table class="table" style="width:100%" layoutH="138">
		<thead>
			<tr>
				<th><center>用户ID</center></th>
				<th><center>用户名</center></th>
				<th><center>用户角色</center></th>
				<th><center>用户权限</center></th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="userList">
				<tr target="sid_user" rel="<s:property value="uid"/>">
					<td><s:property value="uid"/></td>
					<td><s:property value="username"/></td>
					<td><s:property value="rolename"/></td>
					<td>各种权限、各种权限、各种权限、各种权限、各种权限</td>
				</tr>	
			</s:iterator>
		</tbody>
	</table>
	<div class="panelBar">
		<div class="pages">
			<span>显示</span>
			<select class="combox" name="numPerPage" onchange="navTabPageBreak({numPerPage:this.value})">
				<option value="20">20</option>
				<option value="50">50</option>
				<option value="100">100</option>
				<option value="200">200</option>
			</select>
			<span>条，共${totalCount}条</span>
		</div>
		
		<div class="pagination" targetType="navTab" totalCount="200" numPerPage="20" pageNumShown="10" currentPage="1"></div>

	</div>
</div>

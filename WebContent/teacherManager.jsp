<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<form id="pagerForm" method="post" action="teacherManager.action">
	<input type="hidden" name="status" value="${param.status}">
	<input type="hidden" name="keywords" value="${param.keywords}" />
	<input type="hidden" name="pageNum" value="1" />
	<input type="hidden" name="numPerPage" value="${model.numPerPage}" />
	<input type="hidden" name="orderField" value="${param.orderField}" />
</form>
<div class="pageHeader">
	<form onsubmit="return navTabSearch(this)" action="userSearch.action" method="post">
	<div class="searchBar">
		<table class="searchContent">
			<tr>
				<td>姓名：<input type="text" name="user.username" /></td>                             
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
			<li><a class="add" href="teacherToAdd.action" target="navTab"><span>添加</span></a></li>
			<li class="line">line</li>
			<li><a class="delete" href="teacherDel.action?teacher.tid={sid_teacher}" target="ajaxTodo" id="deletetea" title="确定要删除吗?"><span>删除</span></a></li>
			<li class="line">line</li>
			<li><a class="edit" id="edittea" href="teacherUpdate.action?teacher.tid={sid_teacher}" target="navTab"><span>修改</span></a></li>
		</ul>
	</div>
	<table class="table" style="width:100%" layoutH="138">
		<thead>
			<tr>
				<th><center>教师id</center></th>
				<th><center>姓名</center></th>
				<th><center>性别</center></th>
				<th><center>系部</center></th>
				<th><center>职称</center></th>
				<th><center>电话</center></th>
				<th><center>手机</center></th>
				<th><center>职位	</center></th>
				<th><center>备注</center></th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="teachList" id="teacher">
				<tr target="sid_teacher" rel="<s:property value="tid"/>">
					<td><s:property value="tid"/></td>
					<td><s:property value="tname"/></td>
					<td><s:property value="tsex"/></td>
					<td><s:property value="tdept"/></td>
 					<td><s:property value="ttitle"/></td>
					<td><s:property value="ttel"/></td>
					<td><s:property value="tmobile"/></td>
					<td><s:property value="tposition"/></td>
					<td><s:property value="tremark"/></td>
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

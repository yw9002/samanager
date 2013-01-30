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
			<li><a class="add" href="periodicalToAdd.action" target="navTab"><span>添加</span></a></li>
			<li class="line">line</li>
			<li><a class="delete" href="periodicalDel.action?periodical.pid={sid_periodical}" target="ajaxTodo" id="deleteper" title="确定要删除吗?"><span>删除</span></a></li>
			<li class="line">line</li>
			<li><a class="edit" id="editper" href="periodicalToUpdate.action?periodical.pid={sid_periodical}" target="navTab"><span>修改</span></a></li>
		</ul>
	</div>
	<table class="table" style="width:100%" layoutH="138">
		<thead>
			<tr>
				<th><center>ID</center></th>
				<th><center>名称</center></th>
				<th><center>刊号</center></th>
				<th><center>性质</center></th>
				<th><center>分类</center></th>
				<th><center>ISSN</center></th>
				<th><center>CN</center></th>
				<th><center>主办单位</center></th>
				<th><center>检索情况</center></th>
				<th><center>荣誉</center></th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="periodicalList" id="periodical">
				<tr target="sid_periodical" rel="<s:property value="pid"/>">
					<td><s:property value="pid"/></td>
					<td><s:property value="pname"/></td>
					<td><s:property value="pno"/></td>
					<td><s:property value="pproperties"/></td>
 					<td><s:property value="ptype"/></td>
					<td><s:property value="pissn"/></td>
					<td><s:property value="pcn"/></td>
					<td><s:property value="punit"/></td>
					<td><s:property value="psearch"/></td>
					<td><s:property value="phonour"/></td>
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

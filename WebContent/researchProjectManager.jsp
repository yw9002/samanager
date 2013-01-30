<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<form id="pagerForm" method="post" action="queryResearchProjectsList.action">
	<input type="hidden" name="pageNum" value="1" />
	<input type="hidden" name="numPerPage" value="<s:property value="pageModel.pageSize"/>" />
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
			<li><a class="add" href="toAddPro.action" target="navTab"><span>添加</span></a></li>
			<li class="line">line</li>
			<li><a class="delete" href="toDelPro.action?researchProject.proId={sid_researchProject}" target="ajaxTodo" id="deluser" title="确定要删除吗?"><span>删除</span></a></li>
			<li class="line">line</li>
			<li><a class="edit" id="edituser" href="toUpdatePro.action?researchProject.proId={sid_researchProject}" target="navTab"><span>修改</span></a></li>
		</ul>
	</div>
	<table class="table" style="width:100%" layoutH="138">
		<thead>
			<tr>
				<th style="width:60px"><center>项目编号</center></th>
				<th style="width:220px"><center>项目名称</center></th>
				<th style="width:169px"><center>项目类型</center></th>
				<th style="width:45px"><center>负责人</center></th>
				<th><center>项目参与人</center></th>
				<th style="width:150px"><center>资助机构</center></th>
				<th style="width:60px"><center>资助(万)</center></th>
				<th style="width:60px"><center>配套(万)</center></th>
				<th style="width:60px"><center>期限</center></th>
				<th style="width:135px"><center>批文号</center></th>
				<th><center>立项时间</center></th>
			</tr>
		</thead>
<script type="text/javascript">
function trclick(ckid){
	var edit = document.getElementById("edituser");
	var del = document.getElementById("deluser");
	edit.href="editUser.action?user.uid="+ckid;
	del.href="delUser.action?user.uid="+ckid;
}
</script>
		<tbody>
			<s:iterator value="researchProjectList">
				<tr target="sid_researchProject" rel="<s:property value="proId"/>">
					<td><s:property value="proNo"/></td>
					<td><s:property value="proTopic"/></td>
					<td><s:property value="proType"/></td>
					<td><s:property value="proPrincipal"/></td>
					<td><s:property value="proParticipate"/></td>
					<td><s:property value="proSubsidize"/></td>
					<td><s:property value="proMoney"/></td>
					<td><s:property value="proSupporting"/></td>
					<td><s:property value="proStartDate"/>-<s:property value="proEndDate"/></td>
					<td><s:property value="proApproval"/></td>
					<td><s:property value="proSign"/></td>
				</tr>
			</s:iterator>	
		</tbody>
	</table>
	<div class="panelBar">
		<div class="pages">
			<span>显示</span>
			<select class="combox" name="numPerPage" onchange="navTabPageBreak({numPerPage:this.value})">
				<s:if test="pageModel.pageSize==20">
					<option value="20" selected="selected">20</option>
					<option value="50">50</option>
					<option value="100">100</option>
					<option value="200">200</option>
				</s:if>
				<s:elseif test="pageModel.pageSize==50">
					<option value="20">20</option>
					<option value="50" selected="selected">50</option>
					<option value="100">100</option>
					<option value="200">200</option>
				</s:elseif>
				<s:elseif test="pageModel.pageSize==100">
					<option value="20">20</option>
					<option value="50">50</option>
					<option value="100"  selected="selected">100</option>
					<option value="200">200</option>
				</s:elseif>
				<s:else>
					<option value="20">20</option>
					<option value="50">50</option>
					<option value="100">100</option>
					<option value="200"  selected="selected">200</option>
				</s:else>
			</select>
			<span>条，共<s:property value="pageModel.totalRecord"/>条</span>
		</div>
		<div class="pagination" targetType="navTab" totalCount="<s:property value="pageModel.totalRecord"/>" numPerPage="<s:property value="pageModel.pageSize"/>" pageNumShown="10" currentPage="<s:property value="pageModel.pageNum"/>"></div>
	</div>
</div>

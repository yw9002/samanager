<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<script style="text/javascript">
	function topwin(){
	   var rt = window.showModalDialog("uploadframe.jsp");
	   $.ajax({
	          url: "getFileList.action",
	          type: "post",
	          dataType: "html",
	          success: function(data){
	            $("#filelist").html($(data).filter("#filelist").html());
	          }
	    });
	}
	function del(name){
		if(confirm("确定删除?")){
			$.ajax({
				url: "deletfile.action",
				type: "post",
				dataType: "html",
				data: "fileRealName="+name,
				success: function(data){
				$("#filelist").html($(data).filter("#filelist").html());
				}
			});
		}
	}
</script>
<div class="pageContent">
	<form method="post" action="addResearchProjects.action" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
		<div class="pageFormContent" layoutH="56">
           <input type="hidden" name="opr" value="add"/>
           <table class="myTable">
        	<tr>
                <td class="bc" style="width:12%">项目编号：</td><td style="width:21%"><input name="researchProject.proNo" class="required" type="text" size="20"/></td>
                <td class="bc" style="width:12%">项目名称：</td><td style="width:21%"><input name="researchProject.proTopic" class="required" type="text" size="20"/></td>
                <td class="bc" style="width:12%">项目类型：</td><td style="width:21%"><input name="researchProject.proType" class="required" type="text" size="20"/></td>
            <tr>
            <tr>
                <td class="bc">项目负责人：</td><td><input type="text" id="proPrincipal"  class="required" size="20" onkeydown="show()" name="researchProject.proPrincipal"></td>
                <td class="bc">项目参与人：</td><td><input name="researchProject.proParticipate" class="required" type="text" size="20"/></td>
                <td class="bc">资助机构：</td><td><input name="researchProject.proSubsidize" class="required" type="text" size="20"/></td>
            <tr>
            <tr>
                <td class="bc">项研开始：</td><td><input type="text" name="researchProject.proStartDate" class="date textInput" size="20" /></td>
                <td class="bc">项研结束：</td><td><input type="text" name="researchProject.proEndDate" class="date textInput" size="20" /></td>
                <td class="bc">配套金额（万）：</td><td><input type="text" name="researchProject.proSupporting" class="number" size="20" /></td>
                
            <tr>
            <tr>
            	<td class="bc">立项时间：</td><td><input type="text" name="researchProject.proSign" class="date textInput" size="20" /></td>
            	<td class="bc">资助金额（万）：</td><td><input name="researchProject.proMoney" class="number" type="text" size="20"/></td>
                <td class="bc">批文号：</td><td><input name="researchProject.proApproval" type="text" size="20" /></td>
            <tr>
            <tr>
            	<td class="fc">附件列表：</td>
            	<td colspan="2">
            		<div id="filelist">
            			暂无附件
            		</div>
            	</td>
            	<td colspan="2">
            		<div style="width:100%;color:#666">提醒：在文件上传页面，可以点击增加附件，同时上传多个附件.</div>
            	</td>
            	<td>
            		<input type="button"  onClick="topwin()" value="上传附件" style="border: 1px solid #ccc; cursor: pointer;font-size:16px; width:90px;height:50px"/>
            	</td>
            <tr>
        </table>
        </div>
		<div class="formBar">
			<ul>
				<!--<li><a class="buttonActive" href="javascript:;"><span>保存</span></a></li>-->
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">保存</button></div></div></li>
				<li>
					<div class="button"><div class="buttonContent"><button type="button" class="close">取消</button></div></div>
				</li>
			</ul>
		</div>
	</form>
</div>

	

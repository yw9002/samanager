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
	            $("#filelist2").html($(data).filter("#filelist").html());
	          }
	    });
	}
	function del2(name){
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
		<input type="hidden" name="opr" value="update"/>
		<div class="pageFormContent" layoutH="56">
            <p style="min-width:400px; width:45%">
				<label>项目编号：</label>
				<input name="researchProject.proNo" value="<s:property value="researchProject.proNo"/>" class="required" type="text" size="30" alt="请输入项目编号" />
			</p>
			 <p style="min-width:400px; width:45%">
				<label>项目名称：</label>
				<input name="researchProject.proTopic" value="<s:property value="researchProject.proTopic"/>" class="required" type="text" size="30" alt="请输入项目名称"/>
			</p>
            <p style="min-width:400px; width:45%">
				<label>项目类型：</label>
				<input name="researchProject.proType" value="<s:property value="researchProject.proType"/>" class="required" type="text" size="30" alt="请输入项目类型"/>
			</p>
			
			 <p style="min-width:400px; width:45%">
				<label>项目负责人：</label>
				<input type="text" id="proPrincipal" value="<s:property value="researchProject.proPrincipal"/>"  class="required" size="30" onkeydown="show()" name="researchProject.proPrincipal">

			</p>
		 	 <p style="min-width:400px; width:45%">
				<label>项目参与人：</label>
				<input name="researchProject.proParticipate" value="<s:property value="researchProject.proParticipate"/>" class="required" type="text" size="30"/>
			</p>
          	  <p style="min-width:400px; width:45%">
				<label>资助机构：</label>
				<input name="researchProject.proSubsidize" value="<s:property value="researchProject.proSubsidize"/>" class="required" type="text" size="30"/>
			</p>
			 <p style="min-width:400px; width:45%">
				<label>资助金额（万）：</label>
				<input name="researchProject.proMoney" value="<s:property value="researchProject.proMoney"/>"  class="number" type="text" size="30"/>
			</p>
			  <p style="min-width:400px; width:45%">
				<label>配套金额（万）：</label>
				<input type="text" name="researchProject.proSupporting" value="<s:property value="researchProject.proSupporting"/>" class="number" size="30" />
			</p>
			  <p style="min-width:400px; width:45%">
				<label>研究起始日期：</label>
				<input type="text" name="researchProject.proStartDate" value="<s:property value="researchProject.proStartDate"/>" class="date textInput" size="30" />
			</p>
       		 <p style="min-width:400px; width:45%">
				<label>研究结束日期：</label>
				<input type="text" name="researchProject.proEndDate" value="<s:property value="researchProject.proEndDate"/>" class="date textInput" size="30" />
			</p>
             <p style="min-width:400px; width:45%">
				<label>立项时间：</label>
				<input type="text" name="researchProject.proSign" value="<s:property value="researchProject.proSign"/>" class="date textInput" size="30" />
			</p>
			  <p style="min-width:400px; width:45%">
				<label>批文号：</label>
				<input name="researchProject.proApproval" type="text" value="<s:property value="researchProject.proApproval"/>" size="30" />
			</p>
			<div class="divider"></div>
			
			<div style="margin:8px;float:left;width:45%">
				<div style="font-size: 16px; font-weight: bold;">附件列表：</div>
				<div id="filelist2" style="margin-top: 8px;">
					<s:if test="filelist.size==0">
						<span style="color:red">暂无附件</span>
					</s:if>
					<s:else>
						<ul style="font-size: 12px">
							<s:iterator value="filelist" id="file">
							<li style="border-bottom: 1px #ccc dotted; list-style: none;line-height: 18px;">
								<s:property value="uploadFileName"/>
									<span style="margin-left:20px;">
										<a href="download.action?fileRealName=<s:property value="uploadRealName"/>&fileName=<s:property value="uploadFileName"/>" style="color:orange">下载</a>
									</span>
									<span style="margin-left:10px;">
										<a href="javascript:void(0)" onclick="del('<s:property value="uploadRealName"/>')"  style="color:green">删除</a>
									</span>
							</li>
							</s:iterator>
						</ul>
					</s:else>
				</div>
			</div>
			<div style="margin:8px; float:left; padding-left:18px; height:80px;border-left: 1px dotted #ccc;" id="uploaddiv">
				<input type="button"  onClick="topwin()" value="上传附件" style="border: 1px solid #ccc; cursor: pointer;font-size:16px; width:100px;height:50px"/>
			</div>
       		</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">保存</button></div></div></li>
				<li>
					<div class="button"><div class="buttonContent"><button type="button" class="close">取消</button></div></div>
				</li>
			</ul>
		</div>
	</form>
</div>

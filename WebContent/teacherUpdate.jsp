<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="pageContent">
	<form method="post" action="teacherSave.action" class="pageForm required-validate"	onsubmit="return validateCallback(this, navTabAjaxDone)">
		<input name="opr" value="update" type="hidden"/>
		<input name="teacher.tid" value="<s:property value="teacher.tid"/>" type="hidden"/>
		<div class="pageFormContent" layoutH="56">
			<p style="width: 100%; min-width: 400px">
				<label>姓名：</label> 
				<input name="teacher.tname" class="required" type="text" size="30" value='<s:property value="teacher.tname"/>'/>
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>性别：</label> 
				<select name="teacher.tsex" class="required combox">
						<s:if test='teacher.tsex.equals("男")'>
							<option value="男" selected="selected">男</option>
							<option value="女">女</option>
						</s:if>
						<s:else>
							<option value="男">男</option>
							<option value="女" selected="selected">女</option>
						</s:else>
				</select>
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>系别：</label> 
				<input name="teacher.tdept" type="text" size="30" value='<s:property value="teacher.tdept"/>'/>
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>职称：</label> 
				<input name="teacher.ttitle" size="30" type="text" value='<s:property value="teacher.ttitle"/>'/>
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>固定电话：</label> 
				<input name="teacher.ttel" size="30" type="text" value='<s:property value="teacher.ttel"/>'/>
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>移动电话：</label> 
				<input name="teacher.tmobile" type="text" size="30" value='<s:property value="teacher.tmobile"/>'/>
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>职位：</label> 
				<input name="teacher.tposition" type="text" size="30" value='<s:property value="teacher.tposition"/>'/>
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>备注：</label> 
				<input name="teacher.tremark" size="30" type="text" value='<s:property value="teacher.tremark"/>'/>
			</p>
		</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive">
						<div class="buttonContent">
							<button type="submit">保存</button>
						</div>
					</div>
				</li>
				<li>
					<div class="button">
						<div class="buttonContent">
							<button type="button" class="close">取消</button>
						</div>
					</div>
				</li>
			</ul>
		</div>
	</form>
</div>

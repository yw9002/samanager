<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="pageContent">
	<form method="post" action="teacherSave.action" class="pageForm required-validate"	onsubmit="return validateCallback(this, navTabAjaxDone)">
		<input name="opr" value="add" type="hidden"/>
		<div class="pageFormContent" layoutH="56">
			<p style="width: 100%; min-width: 400px">
				<label>姓名：</label> 
				<input name="teacher.tname" class="required" type="text" size="30"/>
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>性别：</label> 
				<select name="teacher.tsex" class="required combox">
						<option value="男">男</option>
						<option value="女">女</option>
				</select>
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>系别：</label> 
				<input name="teacher.tdept" type="text" size="30"/>
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>职称：</label> 
				<input name="teacher.ttitle" size="30" type="text"/>
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>固定电话：</label> 
				<input name="teacher.ttel" size="30" type="text"/>
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>移动电话：</label> 
				<input name="teacher.tmobile" type="text" size="30" />
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>职位：</label> 
				<input name="teacher.tposition" type="text" size="30" />
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>备注：</label> 
				<input name="teacher.tremark" size="30" type="text" />
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

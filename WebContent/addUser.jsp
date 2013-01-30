<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="pageContent">
	<form method="post" action="saveUser.action" class="pageForm required-validate"	onsubmit="return validateCallback(this, navTabAjaxDone)">
		<input name="opr" value="add" type="hidden"/>
		<div class="pageFormContent" layoutH="56">
			<p style="width: 100%; min-width: 400px">
				<label>用&nbsp;&nbsp;户&nbsp;&nbsp;名：</label> 
				<input name="user.username" class="required" type="text" size="30" value="<s:property value="user.username"/>" />
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>用户类型：</label> 
				<select name="user.roleid" class="required combox">
					<s:iterator value="userRoleList" id="list">
						<option value="<s:property value="roleid"/>">
							<s:property value="rolename" />
						</option>
					</s:iterator>
				</select>
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>用户密码：</label> 
				<input id="p1" name="user.password"	class="required alphanumeric" minlength="4" maxlength="20" type="password" size="30" />
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>确认密码：</label> <input id="p2" name="password_again" class="required" equalto="#p1" type="password" size="30" />
			</p>
		</div>
		<div class="formBar">
			<ul>
				<!--<li><a class="buttonActive" href="javascript:;"><span>保存</span></a></li>-->
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

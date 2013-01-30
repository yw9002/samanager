<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="pageContent">
	<form method="post" action="periodicalSave.action" class="pageForm required-validate"	onsubmit="return validateCallback(this, navTabAjaxDone)">
		<input name="opr" value="update" type="hidden"/>
		<div class="pageFormContent" layoutH="56">
			<p style="width: 100%; min-width: 400px">
				<label>期刊名称：</label> 
				<input name="periodical.pname" class="required" value="<s:property value="periodical.pname"/>" type="text" size="30"/>
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>期刊编号：</label> 
				<input name="periodical.pno" class="required" value="<s:property value="periodical.pno"/>" type="text" size="30"/>
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>期刊性质：</label> 
				<input name="periodical.pproperties" type="text" value="<s:property value="periodical.pproperties"/>" size="30"/>
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>期刊分类：</label> 
				<input name="periodical.ptype" size="30" value="<s:property value="periodical.ptype"/>"  type="text"/>
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>ISSN：</label> 
				<input name="periodical.pissn" size="30" value="<s:property value="periodical.pissn"/>" type="text"/>
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>CN：</label> 
				<input name="periodical.pcn" type="text" value="<s:property value="periodical.pcn"/>" size="30" />
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>主办单位：</label> 
				<input name="periodical.punit" type="text" value="<s:property value="periodical.punit"/>" size="30" />
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>检索情况：</label> 
				<input name="periodical.psearch" size="30" value="<s:property value="periodical.psearch"/>" type="text" />
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>期刊荣誉：</label> 
				<input name="periodical.phonour" size="30" value="<s:property value="periodical.phonour"/>" type="text" />
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

<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="pageContent">
	<form method="post" action="periodicalSave.action" class="pageForm required-validate"	onsubmit="return validateCallback(this, navTabAjaxDone)">
		<input name="opr" value="add" type="hidden"/>
		<div class="pageFormContent" layoutH="56">
			<p style="width: 100%; min-width: 400px">
				<label>期刊名称：</label> 
				<input name="periodical.pname" class="required" type="text" size="30"/>
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>期刊编号：</label> 
				<input name="periodical.pno" class="required" type="text" size="30"/>
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>期刊性质：</label> 
				<input name="periodical.pproperties" type="text" size="30"/>
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>期刊分类：</label> 
				<input name="periodical.ptype" size="30" type="text"/>
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>ISSN：</label> 
				<input name="periodical.pissn" size="30" type="text"/>
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>CN：</label> 
				<input name="periodical.pcn" type="text" size="30" />
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>主办单位：</label> 
				<input name="periodical.punit" type="text" size="30" />
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>检索情况：</label> 
				<input name="periodical.psearch" size="30" type="text" />
			</p>
			<p style="width: 100%; min-width: 400px">
				<label>期刊荣誉：</label> 
				<input name="periodical.phonour" size="30" type="text" />
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

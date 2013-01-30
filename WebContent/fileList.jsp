<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="filelist">
<s:if test="filelist.size==0">
暂无附件。
</s:if>
<s:else>
	<ul style="font-size: 12px">
	<s:iterator value="filelist" id="file">
	<li style="border-bottom: 1px #ccc dotted; list-style: none;line-height: 18px;">
		<div style="float:left;width:1px"></div>
		<div style="width:85px;float:right">
			<span style="margin-left:20px;">
				<a href="download.action?fileRealName=<s:property value="uploadRealName"/>&fileName=<s:property value="uploadFileName"/>" style="color:orange">下载</a>
			</span>
			<span style="margin-left:10px;">
				<a href="javascript:void(0)" onclick="del('<s:property value="uploadRealName"/>')"  style="color:green">删除</a>
			</span>
		</div>
		<div><s:property value="uploadFileName"/></div>
	</li>
	</s:iterator>
	</ul>
</s:else>
</div>
</body>
</html>
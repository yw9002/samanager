<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
    response.addHeader("Access-Control-Allow-Origin", "*");
    response.addHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS");
    response.addHeader("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With");
%>

[
<s:iterator value="teacherNameList" status="teacher">
	<s:if test="%{!#teacher.last}">
		{"id":"<s:property value="tid"/>","label":"<s:property value="tname"/>","value":"<s:property value="tname"/>"},
	</s:if>
	<s:else>
		{"id":"<s:property value="tid"/>","label":"<s:property value="tname"/>,"value":"<s:property value="tname"/>""}
	</s:else>
</s:iterator>
]
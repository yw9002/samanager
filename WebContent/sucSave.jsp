<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:if test="msg=='操作成功'">
{
      "statusCode":"200", 
      "message":"<s:property value="msg"/>", 
      "navTabId":"", 
      "rel":"", 
      "callbackType":"",
      "forwardUrl":""
}
</s:if>
<s:else>
{
      "statusCode":"300", 
      "message":"<s:property value="msg"/>", 
      "navTabId":"", 
      "rel":"", 
      "callbackType":"",
      "forwardUrl":""
}
</s:else>

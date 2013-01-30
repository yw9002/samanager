<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/jquery-1.7.2.js" type="text/javascript"></script>
<script type="text/javascript">
$(function(){
	var flag = 2;
	$("#addinput").click(function(){
		$("#inputdiv").append("<div class='in'>附件"+flag+"：<input type='file' name='upload'/></div>");
		flag = flag +1;
	});
});
</script>
<style type="text/css">
*{
	margin:0;
}
body{
	font-size:14px;
}
.btn{
	border:1px solid #ccc;
	cursor: pointer;
	height:22px;
	line-height:20px;
}
#container{
	margin:10px;
}
.in{
	height:30px;
	text-align:center;
}
</style>
<title>文件上传</title>
</head>
<body>
<div id="container">
	<form action="upload.action" theme="simple" method="post"	enctype="multipart/form-data">
		<div id="inputdiv">
		<div class="in">附件1：<s:file name="upload"></s:file></div>
		</div>
		<div class="in"><input type="submit" value="上传" class="btn"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="增加附件" class="btn" id="addinput"/>&nbsp;&nbsp;&nbsp;&nbsp;<input class="btn" type="reset" value="重置"/></div>
	</form>
</div>
</body>
</html>
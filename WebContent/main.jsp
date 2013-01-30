<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<title>科技成果管理系统 - 湖南人文科技学院计算机科学技术系 Powered by yanshare.com</title>
<link href="themes/default/style.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="themes/css/core.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="themes/css/print.css" rel="stylesheet" type="text/css" media="print"/>
<link href="uploadify/css/uploadify.css" rel="stylesheet" type="text/css" media="screen"/>

<link href="style/global.css" type="text/css" rel="stylesheet"/>
<!--[if IE]>
<link href="themes/css/ieHack.css" rel="stylesheet" type="text/css" media="screen"/>
<![endif]-->
<script src="js/speedup.js" type="text/javascript"></script>
<script src="js/jquery-1.7.2.js" type="text/javascript"></script>
<script src="js/jquery.cookie.js" type="text/javascript"></script>
<script src="js/jquery.validate.js" type="text/javascript"></script>
<script src="js/jquery.bgiframe.js" type="text/javascript"></script>
<script src="xheditor/xheditor-1.1.14-zh-cn.min.js" type="text/javascript"></script>
<script src="uploadify/scripts/swfobject.js" type="text/javascript"></script>
<script src="uploadify/scripts/jquery.uploadify.v2.1.0.js" type="text/javascript"></script>
<!-- svg图表  supports Firefox 3.0+, Safari 3.0+, Chrome 5.0+, Opera 9.5+ and Internet Explorer 6.0+ -->
<script type="text/javascript" src="chart/raphael.js"></script>
<script type="text/javascript" src="chart/g.raphael.js"></script>
<script type="text/javascript" src="chart/g.bar.js"></script>
<script type="text/javascript" src="chart/g.line.js"></script>
<script type="text/javascript" src="chart/g.pie.js"></script>
<script type="text/javascript" src="chart/g.dot.js"></script>
<script src="js/dwz.core.js" type="text/javascript"></script>
<script src="js/dwz.util.date.js" type="text/javascript"></script>
<script src="js/dwz.validate.method.js" type="text/javascript"></script>
<script src="js/dwz.regional.zh.js" type="text/javascript"></script>
<script src="js/dwz.barDrag.js" type="text/javascript"></script>
<script src="js/dwz.drag.js" type="text/javascript"></script>
<script src="js/dwz.tree.js" type="text/javascript"></script>
<script src="js/dwz.accordion.js" type="text/javascript"></script>
<script src="js/dwz.ui.js" type="text/javascript"></script>
<script src="js/dwz.theme.js" type="text/javascript"></script>
<script src="js/dwz.switchEnv.js" type="text/javascript"></script>
<script src="js/dwz.alertMsg.js" type="text/javascript"></script>
<script src="js/dwz.contextmenu.js" type="text/javascript"></script>
<script src="js/dwz.navTab.js" type="text/javascript"></script>
<script src="js/dwz.tab.js" type="text/javascript"></script>
<script src="js/dwz.resize.js" type="text/javascript"></script>
<script src="js/dwz.dialog.js" type="text/javascript"></script>
<script src="js/dwz.dialogDrag.js" type="text/javascript"></script>
<script src="js/dwz.sortDrag.js" type="text/javascript"></script>
<script src="js/dwz.cssTable.js" type="text/javascript"></script>
<script src="js/dwz.stable.js" type="text/javascript"></script>
<script src="js/dwz.taskBar.js" type="text/javascript"></script>
<script src="js/dwz.ajax.js" type="text/javascript"></script>
<script src="js/dwz.pagination.js" type="text/javascript"></script>
<script src="js/dwz.database.js" type="text/javascript"></script>
<script src="js/dwz.datepicker.js" type="text/javascript"></script>
<script src="js/dwz.effects.js" type="text/javascript"></script>
<script src="js/dwz.panel.js" type="text/javascript"></script>
<script src="js/dwz.checkbox.js" type="text/javascript"></script>
<script src="js/dwz.history.js" type="text/javascript"></script>
<script src="js/dwz.combox.js" type="text/javascript"></script>
<script src="js/dwz.print.js" type="text/javascript"></script>
<!--
<script src="bin/dwz.min.js" type="text/javascript"></script>
-->
<script src="js/dwz.regional.zh.js" type="text/javascript"></script>
<script type="text/javascript">
$(function(){
	DWZ.init("dwz.frag.xml", {
		loginUrl:"login_dialog.html", loginTitle:"登录",	// 弹出登录对话框
//		loginUrl:"login.html",	// 跳到登录页面
		statusCode:{ok:200, error:300, timeout:301}, //【可选】
		pageInfo:{pageNum:"pageNum", numPerPage:"numPerPage", orderField:"orderField", orderDirection:"orderDirection"}, //【可选】
		debug:false,	// 调试模式 【true|false】
		callback:function(){
			initEnv();
			$("#themeList").theme({themeBase:"themes"}); // themeBase 相对于index页面的主题base路径
		}
	});
});

</script>
</head>
<body scroll="no">
<div id="layout">
  <div id="header">
    <div class="headerNav"> <a class="logo" href="#">标志</a>
      <ul class="nav">
     	<li><a href="#">欢迎您,${sessionScope.user.username}</a></li>
        <li><a href="#" target="dialog" width="600">修改密码</a></li>
        <li><a href="index.html">退出</a></li>
      </ul>
      <ul class="themeList" id="themeList">
        <li theme="default">
          <div class="selected">蓝色</div>
        </li>
        <li theme="green">
          <div>绿色</div>
        </li>
        <!--<li theme="red"><div>红色</div></li>-->
        <li theme="purple">
          <div>紫色</div>
        </li>
        <li theme="silver">
          <div>银色</div>
        </li>
        <li theme="azure">
          <div>天蓝</div>
        </li>
      </ul>
    </div>
    <!-- navMenu -->
  </div>
  <div id="leftside">
    <div id="sidebar_s">
      <div class="collapse">
        <div class="toggleCollapse">
          <div></div>
        </div>
      </div>
    </div>
    <div id="sidebar">
      <div class="toggleCollapse">
        <h2>-欢迎使用科研成果管理系统-</h2>
        <div>收缩</div>
      </div>
      <div class="accordion" fillSpace="sidebar">
        <div class="accordionHeader">
          <h2><span>Folder</span>科研立项</h2>
        </div>
        <div class="accordionContent">
          <ul class="tree treeFolder">
            <li><a onclick="javascript:void(0)">科研立项</a>
              <ul>
                <li><a href="toAddPro.action" target="navTab" rel="001">项目录入</a></li>
                <li><a href="queryResearchProjectsList.action" target="navTab" rel="002">项目检索</a></li>
                <li><a href="importResearchProjects.html" target="navTab" rel="003">批量导入</a></li>
              </ul>
            </li>
          </ul>
        </div>
        <div class="accordionHeader">
          <h2><span>Folder</span>科研论文</h2>
        </div>
        <div class="accordionContent">
          <ul class="tree treeFolder">
            <li><a onclick="javascript:void(0)">科研论文</a>
              <ul>
                <li><a href="addResearchProjects.html" target="navTab" rel="004">项目录入</a></li>
                <li><a href="searchResearchProjects.html" target="navTab" rel="005">项目检索</a></li>
                <li><a href="importResearchProjects.html" target="navTab" rel="006">批量导入</a></li>
              </ul>
            </li>
          </ul>
        </div>
        <div class="accordionHeader">
          <h2><span>Folder</span>教学研究</h2>
        </div>
        <div class="accordionContent">
          <ul class="tree treeFolder">
            <li><a onclick="javascript:void(0)">教改项目</a>
              <ul>
                <li><a href="addResearchProjects.html" target="navTab" rel="007">项目录入</a></li>
                <li><a href="searchResearchProjects.html" target="navTab" rel="008">项目检索</a></li>
                <li><a href="importResearchProjects.html" target="navTab" rel="009">批量导入</a></li>
              </ul>
            </li>
          </ul>
          <ul class="tree treeFolder collapse">
            <li><a onclick="javascript:void(0)">教材专著</a>
              <ul>
                <li><a href="addResearchProjects.html" target="navTab" rel="010">项目录入</a></li>
                <li><a href="searchResearchProjects.html" target="navTab" rel="011">项目检索</a></li>
                <li><a href="importResearchProjects.html" target="navTab" rel="012">批量导入</a></li>
              </ul>
            </li>
          </ul>
          <ul class="tree treeFolder collapse">
            <li><a onclick="javascript:void(0)">教管论文</a>
              <ul>
                <li><a href="addResearchProjects.html" target="navTab" rel="013">项目录入</a></li>
                <li><a href="searchResearchProjects.html" target="navTab" rel="014">项目检索</a></li>
                <li><a href="importResearchProjects.html" target="navTab" rel="015">批量导入</a></li>
              </ul>
            </li>
          </ul>
          <ul class="tree treeFolder collapse">
            <li><a onclick="javascript:void(0)">教管获奖</a>
              <ul>
                <li><a href="addResearchProjects.html" target="navTab" rel="016">项目录入</a></li>
                <li><a href="searchResearchProjects.html" target="navTab" rel="017">项目检索</a></li>
                <li><a href="importResearchProjects.html" target="navTab" rel="018">批量导入</a></li>
              </ul>
            </li>
          </ul>
          <ul class="tree treeFolder collapse">
            <li><a onclick="javascript:void(0)">教管研究课题</a>
              <ul>
                <li><a href="addResearchProjects.html" target="navTab" rel="019">项目录入</a></li>
                <li><a href="searchResearchProjects.html" target="navTab" rel="020">项目检索</a></li>
                <li><a href="importResearchProjects.html" target="navTab" rel="021">批量导入</a></li>
              </ul>
            </li>
          </ul>
        </div>
        <div class="accordionHeader">
          <h2><span>Folder</span>科研论文</h2>
        </div>
        <div class="accordionContent">
          <ul class="tree treeFolder">
            <li><a onclick="javascript:void(0)">科研论文</a>
              <ul>
                <li><a href="addResearchProjects.html" target="navTab" rel="022">项目录入</a></li>
                <li><a href="searchResearchProjects.html" target="navTab" rel="023">项目检索</a></li>
                <li><a href="importResearchProjects.html" target="navTab" rel="024">批量导入</a></li>
              </ul>
            </li>
          </ul>
        </div>
        <div class="accordionHeader">
          <h2><span>Folder</span>系统管理</h2>
        </div>
        <div class="accordionContent">
          <ul class="tree treeFolder">
            <li><a onclick="javascript:void(0)">系统管理</a>
              <ul>
                <li><a href="getUserList.action" target="navTab" rel="用户管理">用户管理</a></li>
                <li><a href="teacherManager.action" target="navTab" rel="教师管理">教师管理</a></li>
                <li><a href="periodicalManager.action" target="navTab" rel="期刊管理">期刊管理</a></li>
              </ul>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>
  <div id="container">
    <div id="navTab" class="tabsPage">
      <div class="tabsPageHeader">
        <div class="tabsPageHeaderContent">
          <!-- 显示左右控制时添加 class="tabsPageHeaderMargin" -->
          <ul class="navTab-tab">
            <li tabid="main" class="main"><a href="javascript:;"><span><span class="home_icon">我的主页</span></span></a></li>
          </ul>
        </div>
        <div class="tabsLeft">left</div>
        <!-- 禁用只需要添加一个样式 class="tabsLeft tabsLeftDisabled" -->
        <div class="tabsRight">right</div>
        <!-- 禁用只需要添加一个样式 class="tabsRight tabsRightDisabled" -->
        <div class="tabsMore">more</div>
      </div>
      <ul class="tabsMoreList">
        <li><a href="javascript:;">我的主页</a></li>
      </ul>
      <div class="navTab-panel tabsPageContent layoutBox">
        <div class="page unitBox">
          <div class="pageFormContent" layoutH="80" style="margin-right:230px">
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<div id="footer">Copyright &copy; 2012 <a href="http://www.yanshare.com" target="_new">Yanshare</a> Email：ywei9002@gmail.com</div>
</body>
</html>
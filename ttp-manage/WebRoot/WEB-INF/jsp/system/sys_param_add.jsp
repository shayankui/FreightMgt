<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isELIgnored="false"%>
<%@include file="../taglibs.jsp" %>
<html>
  <head>
    <title>系统参数维护</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<link rel="stylesheet" type="text/css" href="${contextPath}/static/css/style.css">
	<script type="text/javascript" src="${contextPath}/static/js/main.js"></script>
  	<script type="text/javascript" src="${contextPath}/static/js/lib/jquery-1.10.2.min.js/"></script>
  </head>
  
  <body>
  	<form action="${contextPath}/system/syspara.do?method=saveSysPara" method="post">
  	参数编码:<input type="text" name="csbm" /><br/>
  	参数名称:<input type="text" name="csmc" /><br/>
  	参数值:<input type="text" name="csz" /><br/>
  	参数备注:<input type="text" name="bz" />
  	<input type="submit" value="提交"> <input type="reset" value="重置">
  	</form>
  </body>
</html>

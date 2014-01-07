<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isELIgnored="false"%>
<%@include file="../../taglibs.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>发货方/司机管理</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<link rel="stylesheet" type="text/css" href="${contextPath}/static/js/lib/easyui/themes/default/easyui.css" />
	<link rel="stylesheet" type="text/css" href="${contextPath}/static/js/lib/easyui/themes/icon.css"/>
	<link rel="stylesheet" type="text/css" href="${contextPath}/static/js/lib/easyui/demo/demo.css"/>
	
	<link rel="stylesheet" type="text/css" href="${contextPath}/static/css/frame.css" />
	<script type="text/javascript" src="${contextPath}/static/js/lib/easyui/jquery.min.js"></script>
	<script type="text/javascript" src="${contextPath}/static/js/lib/easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="${contextPath}/static/js/lib/easyui/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="${contextPath}/static/js/lib/artDialog/jquery.artDialog.source.js?skin=blue"></script>
	<script type="text/javascript" src="${contextPath}/static/js/lib/artDialog/plugins/iframeTools.js"></script>
	<script type="text/javascript" src="${contextPath}/static/js/constant.js"></script>
	<script type="text/javascript" src="${contextPath}/static/js/main.js"></script>
	
	
	
	<script>
		/**
		*操作窗口属性设置,该窗口有下列属性可以设置，不设置将使用默认值
		*title 窗口标题
		*width 窗口宽度
		*lock	窗口模式
		*height 窗口高度
		*resize 窗口是否可以改变大小
		*属性设置如下:var win_setting = {width:200,lock:true,resize:true,heigh:400,title:''};
		*/
  		var win_setting = {};
  		/**
  		* 初始化
  		*/
  		$(document).ready(function(){
  			//查询结果展示结果字段
			var data = [
					{field:'paraName',title:'参数名称',width:120,sortable:true},
					{field:'paraVal',title:'参数值',width:120},
					{field:'bz',title:'备注',width:300}
					];
			//新增记录url
			var addurl = GLOBAL_INFO.CONTEXTPATH + "/jsp/user/user_add.jsp";
			//修改记录url
			var editurl = GLOBAL_INFO.CONTEXTPATH + "/jsp/user/user_edit.jsp";
			//查看记录url
			var viewurl = GLOBAL_INFO.CONTEXTPATH + "/jsp/user/user_view.jsp";
			//查询记录url
			var initurl = "${contextPath}/user.do?method=queryUser";
			//删除记录url
			var deleteurl = "${contextPath}/user.do?method=deleteUser";
			//模块标题
			var title = "用户管理";
			//查询结果排序字段
			var sortName = "";
			//记录主键值
			var PrimaryKey = "";
			
			var page = true;
			/**
			*创建可以进行操作，可以自己定义操作
			*grid 展示结果table id;
			*title 操作窗口标题
			*win_setting 操作窗口属性设置
			*addurl 新增记录url
			*editurl 修改记录url
			*viewurl 查看记录url
			*/
			var toolObj={
				id:'grid',
				title:title,
				win:win_setting,
				addurl:addurl,
				editurl:editurl,
				viewurl:viewurl,
				deleteurl:deleteurl
			};
			var toolbarData = initToolBar(toolObj);
			//不需要工具栏时使用下面方式
			//var toolbarData= [];
			/**
			*创建grid数据展示
			*grid 展示结果table id;
			*initurl 查询记录url
			*data 查询结果展示结果字段
			*toolbarData 创建可以进行操作
			*sortName 查询结果排序字段
			*PrimaryKey 记录主键值
			*page 是否分页
			*title 操作窗口标题
			*viewurl 查看记录url
			*win_setting 操作窗口属性设置
			*/
			var gridObj={
				id:'grid',
				url:initurl,
				columns:data,
				toolbar:toolbarData,
				sortName:sortName,
				idField:PrimaryKey,
				pagination:page
			};
			initGrid(gridObj,title,viewurl,win_setting);
			
			//初始化公共信息
			initCommonInfo();
		});
		
		/**
		*查询时参数设置
		*queryParam为查询参数对象
		*/
		
		function getQueryParam(){
			queryParam.paraName = $(":input[name='paraName']").val();
			return queryParam;
  		}
		
		/**
		* 删除操作时的主键键值对
		*data为一条记录数据
		*/
		function getParameter(data){
			var para = "paraName="+data.paraName;
			return para;
		}
		//新增记录回调函数，默认调用刷新记录方法，可以增加新的方法
		function addCallBack(){
			reloadGrid("grid");
			XW_dialog.tips('保存新增记录信息操作成功！',2);
		}
		//查看记录回调函数，默认调用刷新记录方法，可以增加新的方法
		function viewCallBack(){
			//reloadGrid("grid");
		}
		//编辑记录回调函数，默认调用刷新记录方法，可以增加新的方法
		function editCallBack(msg){
			reloadGrid("grid");
			XW_dialog.tips('修改记录信息操作成功！',2);
		}
		//删除记录回调函数，默认调用刷新记录方法，可以增加新的方法
		function deleteCallBack(){
			reloadGrid("grid");
		}
	</script>
  </head>
  
  <body>
  <div id="main_div" >
  	<!-- 展示区title -->
  	<div class="breadcrumb">用户查询</div>
  	
	  <fieldset class="defaultFieldset">
	  <legend>系统参数查询</legend>
	    <form id="queryForm" name='queryForm' action="" method="post">
	    <!--  多个查询条件时排版 -->
	      <table width="98%" border="1" align="center" cellpadding="1" cellspacing="0" class="defaultTable tableStyle1">
	        <tr> 
		      <th >参数名称：</th>
		      <td><input type="text"  maxlength="100" name="paraName"  value="" /> </td>
		  	  <th>参数值：</th>
		      <td class="form_table_content"><input type="text"  maxlength="100" name="paraVal"  value="" /></td>
		    </tr>
		    <tr>
	          <td colspan="4" style="text-align:center;">
		        <a href="javascript:void(0)" class="btn" onclick="querySubmit('grid')">查 询</a>
		        <a href="javascript:void(0)" class="btn"  onclick="document.queryForm.reset();">重 置</a>
	          </td>
	        </tr>
          </table>


        </form>
      </fieldset>
	 
  <div id="gridParent">
	<!-- 展示结果grid -->
	<table id="grid" class="defaultTable"></table>
  </div>
  </div>
  </body>
</html>

var dhxLayout;
var dhxTabbar;
var dhxSysAccord;
var dhxCustAccord;

var CONTEXTPATH = "/mall_center_manage";
var SYSTEM_MENU_COOKIE_NAME = "SYSTEM_MENU_ID";
var CUSTOM_MENU_COOKIE_NAME = "CUSTOM_MENU_ID";
var TAB_COOKIE_NAME = "TABNAME";
var TREE_NODE = "TREE_NODE";
var TREE_ID = "TREE_ID";
$(document).ready(function(){
	initLayout();
});

//初始化布局
function initLayout(){ 
	dhxLayout = new dhtmlXLayoutObject(document.body, "2U");
	dhxLayout.attachHeader("fra_Top");
	dhxLayout.cells("a").setText("菜单导航区");
	dhxLayout.cells("a").hideHeader();
	dhxLayout.cells("a").setWidth(230);
	dhxLayout.cells("a").attachObject("men_tabbar");
	
	dhxLayout.cells("b").setText("主显示区");
	dhxLayout.cells("b").hideHeader();
	dhxLayout.cells("b").attachObject("frm_main");
	dhxLayout.attachEvent("onPanelResizeFinish", doOnPanelResize);
	initMenuTabbar();
	setMainTab();
}

function doOnPanelResize(ids){
	var atab = dhxTabbar.getActiveTab();
	if(atab=="sysMenu"){
		dhxTabbar.setTabActive("cusMenu");
		dhxTabbar.setTabActive("sysMenu");
	}else{
		dhxTabbar.setTabActive("sysMenu");
		dhxTabbar.setTabActive("cusMenu");
	}
	setMainTab();
}

//设置主显示区TAB条区域自动适配大小
function setMainTab(){
	var mTabs = $('#main_tab');
	var tab = mTabs.tabs('getSelected');			
	mTabs.tabs({fit:true}); 	//强制重绘大小
	mTabs.tabs('select', tab.panel('options').title); //重新选中用户浏览的TAB页
}

//初始化菜单TAB条
function initMenuTabbar(){
	dhxTabbar = new dhtmlXTabBar("men_tabbar", "top");
	dhxTabbar.setSkin('dhx_skyblue');
	dhxTabbar.setImagePath(CONTEXTPATH+"/frame_res/js/dhtmlxSuite/dhtmlxTabbar/codebase/imgs/");
	dhxTabbar.addTab("sysMenu", "系统菜单", "80px");
	dhxTabbar.addTab("cusMenu", "快捷操作", "80px");
	dhxTabbar.setContent("sysMenu", "men_1");
	dhxTabbar.setContent("cusMenu", "men_2");
	dhxTabbar.setCustomStyle("sysMenu", "#036", "#036", "font-family:'微软雅黑',Arial; font-size:13px;");
	dhxTabbar.setCustomStyle("cusMenu", "#036", "#036", "font-family:'微软雅黑',Arial; font-size:13px;");
	dhxTabbar.enableAutoReSize(true);
	//dhxTabbar.setTabActive("sysMenu");
	 changeTab("sysMenu");
	dhxTabbar.attachEvent("onSelect", function(id,last_id){
             setDhxAccordCookie(TAB_COOKIE_NAME,id);
             return true;
    });
   			
	initAccordBar();
}

//初始化子系统层级导航条
function initAccordBar(){
  $.ajax({
    type:"POST",
    url:CONTEXTPATH + "/manage/manage.do?method=getMainMenuBar",
    dataType:"json",
    success:function(msg){
    	if(msg){
    		var custMenuInfo = msg.custom_funs;
    		var result = false;
    		var systemMenuInfo = msg.system_funs;
    		if(systemMenuInfo && systemMenuInfo.length>0){
    			var initSysDisplay = null;
    			dhxAccord = dhxTabbar.cells("sysMenu").attachAccordion('dhx_blue');
				creatMenu(systemMenuInfo,initSysDisplay);
				openItem(SYSTEM_MENU_COOKIE_NAME,initSysDisplay);
				dhxAccord.attachEvent("onActive", function(itemId, state){
					setDhxAccordCookie(SYSTEM_MENU_COOKIE_NAME,itemId);
				});
				
				result = true;
    		}
    		
			if(custMenuInfo && custMenuInfo.length>0){
    			//alert("custMenuInfo:" + custMenuInfo.length);
    			var initCustDisplay = null;
    			//dhxCustAccord = dhxTabbar.cells("cusMenu").attachAccordion('dhx_blue');
    			//alert("dhxCustAccord:" + dhxCustAccord);
				creatCustMenu(custMenuInfo,initCustDisplay);
				openItem(CUSTOM_MENU_COOKIE_NAME,initCustDisplay);
				//dhxCustAccord.attachEvent("onActive", function(itemId, state){
				//	setDhxAccordCookie(CUSTOM_MENU_COOKIE_NAME,itemId);
				//});
    		}
    		openTreeNode();
    		result = true;
    	}
    	if(result != true)
		{
    		alert('加载菜单树失败!');
    	}
    },
    error:function(XMLHttpRequest,textStatus,errorThrown){
    	
    }
  });
}


function setDhxAccordCookie(cookieName,cookieValue){
	var value = $.cookie(cookieName);
	if(value){
		$.cookie(cookieName,null);
	}
	$.cookie(cookieName, cookieValue, { path: CONTEXTPATH, expires: 10 });
}

function openItem(cookieName,defaultValue){
	var value = $.cookie(cookieName);
	if(value){
		dhxAccord.openItem(value);
	}else{
		dhxAccord.openItem(defaultValue);
	}
}

function changeTab(tabId){
	var value = $.cookie(TAB_COOKIE_NAME);
	if(value){
		dhxTabbar.setTabActive(value);
	}else{
		dhxTabbar.setTabActive(tabId);
	}
}

function creatMenu(msg,initDisplay){
	$.each(msg,function(i,item){
		if(!initDisplay){
			initDisplay = item.sysNum;
		}
		dhxAccord.addItem(item.sysNum,item.sysTitle);
		getMenuInfo(item.sysNum,item.list);
	});
}

function creatCustMenu(msg, initDisplay){
	var tid = "tree_cusMenu";
	var treeUl = document.createElement('ul');
	//var str="<ul id='tree_cusMenu' class='ztree'></ul>";
	$(treeUl).html("");
	$(treeUl).attr('id',tid);
	$(treeUl).attr('class','ztree');
	$(treeUl).attr("style","width:100%;height:100%;overflow:auto;");
	$("#men_2").append(treeUl);
	
	creatCusTree(tid,msg);
}

function creatCusTree(tId,msg){
	var funcSetting = {
		treeId:tId,
		treeObj:null,
		//静态加载数据配置
		data: {
			simpleData: {
				enable: true,
				pIdKey: "pid"
			}
		},
		callback: {
			onClick: openPage
		}
	};
	$.fn.zTree.init($("#"+tId), funcSetting, msg);
	//$("#tree_cusMenu").attachObject(sId);
}
	
function getMenuInfo(sysNum,treeData){
 	var tId = "tree_" + sysNum;
 	var sId = "div_" + sysNum;
 	if(createDiv(sId,tId)){
 		creatTree(sId,tId,treeData,sysNum);
 	}
}

//动态创建DIV
function createDiv(sId,tId){
	var result = false;
	if($('#'+sId).length<=0){
		var newDiv = document.createElement('div');
		var str="<ul id='"+ tId +"' class='ztree'></ul>";
		$(newDiv).html(str);
		$(newDiv).attr('id',sId);
		$(newDiv).attr("style","width:100%;height:100%;overflow:auto;");
		$("#parentTree").append(newDiv);
		result = true;
	}else{
		result = true;
	}
	return result;
}

//菜单树加载
function creatTree(sId,treeId,treeData,sysNum){
	var funcSetting = {
		treeId:treeId,
		treeObj:null,
		//静态加载数据配置
		data: {
			simpleData: {
				enable: true,
				pIdKey: "pid"
			}
		},
		callback: {
			onClick: openPage
		}
	};
	$.fn.zTree.init($("#"+treeId), funcSetting, treeData);
	dhxAccord.cells(sysNum).attachObject(sId);
}

function openTreeNode(){
	var treeId = $.cookie(TREE_ID);
	var treeNode = $.cookie(TREE_NODE);
	var zTreeFuncObj = null;
	if(treeId){
		zTreeFuncObj = $.fn.zTree.getZTreeObj(treeId);
		if(treeNode){
			var node = zTreeFuncObj.getNodeByTId(treeNode);
			zTreeFuncObj.expandNode(node,true,true,true,false);
			//zTreeFuncObj.expandAll(true);
		}
	}
}
		
//打开新页面
function openPage(event, treeId, treeNode){

	var leaf = treeNode.isParent;
	if(leaf){
		setDhxAccordCookie(TREE_NODE,treeNode.tId);
	}else{
		setDhxAccordCookie(TREE_NODE,treeNode.parentTId);
	}
	setDhxAccordCookie(TREE_ID,treeId);
	
	var title = treeNode.name;
	var url = getRequestUrl(treeNode);
	if(url){
		var bExists = $('#main_tab').tabs('exists', title);
		if(bExists){
			$('#main_tab').tabs('select', title);
			var tab = $('#main_tab').tabs('getSelected');
			$('#main_tab').tabs('update', {
					tab: tab,
					options:{
						title:title,
						content:'<iframe src="'+ url +'" id="iframe_' + treeNode.tId + '" frameborder="0" scrolling="auto" style="width:100%;height:100%"></iframe>',
						iconCls:'icon-save',
						closable:true
					}
				});
		}else{
			$('#main_tab').tabs('add', {
				title:title,
				content:'<iframe src="'+ url +'" frameborder="0" scrolling="auto" style="width:100%;height:100%"></iframe>',
				iconCls:'icon-save',
				closable:true
			});
		}
	}
}

function passwordPage(url,title,id){
	if(url){
		var bExists = $('#main_tab').tabs('exists', title);
		if(bExists){
			$('#main_tab').tabs('select', title);
			var tab = $('#main_tab').tabs('getSelected');
			$('#main_tab').tabs('update', {
					tab: tab,
					options:{
						title:title,
						content:'<iframe src="'+ url +'" id="iframe_' + id + '" frameborder="0" scrolling="auto" style="width:100%;height:100%"></iframe>',
						iconCls:'icon-save',
						closable:true
					}
				});
		}else{
			$('#main_tab').tabs('add', {
				title:title,
				content:'<iframe src="'+ url +'" frameborder="0" scrolling="auto" style="width:100%;height:100%"></iframe>',
				iconCls:'icon-save',
				closable:true
			});
		}
	}
}

function getRequestUrl(treeNode){
	var initUrl = treeNode.myUrl;
	if(initUrl){
		var mod = treeNode.modelId;
		var loginName = treeNode.loginName;
		if(initUrl.indexOf("?")==-1){
			initUrl += "?mid=" + mod + "&ln=" + loginName;
		}else{
			initUrl += "&mid=" + mod + "&ln=" + loginName;
		}
	}
	return initUrl;
}	
//初始化主显示区
function initMainForm(){
	
}


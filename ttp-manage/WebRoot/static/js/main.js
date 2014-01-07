//全局公共变量
GLOBAL_INFO =
{
    COMMON_REQ_URI	 : '/ttp-manage/actionDispatcher.do',
    CONTEXTPATH      : '/ttp-manage',
    COMMON_SKIN      : 'dhx_blue',
    SYS_FAILED       :  "1",
    SYS_SUCCESS      :  "0",
    PAGING_DEFAULT   :  10	
};

var UOMPComp =
{
	showTipDialog : function(msg, title)
	{
		top.UOMPDialog.alert(msg, "0", title);
	},
	showSuccessDialog : function(msg, title)
	{
		top.UOMPDialog.alert(msg, "1", title);
	},
	showFailedDialog : function(msg, title)
	{
		top.UOMPDialog.alert(msg, "2", title);
	},
	showConfirmDialog : function(msg, callback)
	{
		top.UOMPDialog.confirm(msg, callback);
	}
};

//页面请求对象
PageDynRequestInfo = function()
{
};
PageDynRequestInfo.prototype =
{
	dynamicDataNodeName     : '',
    dynamicURI              : '',
    dynamicParameter        : [],
    dynamicRequestCallback  : null
};

//JSON格式化对象
var JSON =
{
    $defined: function(obj)
    {
        return (obj != undefined);
    },

    encode: function(obj)
    {
        switch (typeof obj)
        {
            case 'string':
                return '"' + obj.replace(/[\x00-\x1f\\"]/g, JSON.$replaceChars) + '"';
            case 'array':
                return '[' + String(obj.map(JSON.encode).filter(JSON.$defined)) + ']';
            case 'object':
                if (obj instanceof Array)
                {
                    //return '[' + String(obj.map(JSON.encode).filter(JSON.$defined)) + ']';
                    //return '{' + String(string) + '}';
                    
                   	var objStr = "";
                    for (var i=0;i<obj.length;i++)
                    {
                    	var string = [];
	                    for (var key in obj[i])
	                    {
	                        var json = JSON.encode(obj[i][key]);
	                        if (json)
	                            string.push(JSON.encode(key) + ':' + json);
	                    }
                    	objStr += '{' + String(string) + '},';
                    }
                    if(objStr.length > 0)
                    {
                    	objStr = objStr.substring(0,objStr.length - 1);
                    	return '[' + objStr + ']';
                    }
                    else
                    {
                    	return '[]';
                    }
                }
                else
                {
                    var string = [];
                    for (var key in obj)
                    {
                        var json = JSON.encode(obj[key]);
                        if (json)
                            string.push(JSON.encode(key) + ':' + json);
                    }
                    return '{' + String(string) + '}';
                }  
            case 'number':
            case 'boolean':
                return String(obj);
            case false:
                return 'null';
        }
        return null;
    },

    $specialChars:
    {
        '\b': '\\b',
        '\t': '\\t',
        '\n': '\\n',
        '\f': '\\f',
        '\r': '\\r',
        '"': '\\"',
        '\\': '\\\\'
    },

    $replaceChars: function(chr)
    {
        return JSON.$specialChars[chr] || '\\u00' + Math.floor(chr.charCodeAt() / 16).toString(16) + (chr.charCodeAt() % 16).toString(16);
    },

    decode: function(string, secure)
    {
        if (typeof string != 'string' || !string.length)
            return null;
        if (secure && !(/^[,:{}\[\]0-9.\-+Eaeflnr-u \n\r\t]*$/).test(string.replace(/\\./g, '@').replace(/"[^"\\\n\r]*"/g, '')))
            return null;
        return eval('(' + string + ')');
    },
        //将form表单转换为json对象
    form2json:function(form)
	{
		var json = {};
		if(form)
		{
			var data = $('#'+form).serializeArray();
			for(var i=0;i<data.length;i++)
			{
				json[data[i].name] = data[i].value;
			}
		}
		return json;
	}
};

//封装AJAX请求
jQuery.extend({
	//多个请求
    multiReqs : (function(){
        var default_options = {
            "type"        :    "post",
            "timeout"     :    "40000",
            "contentType" :    "application/x-www-form-urlencoded; charset=UTF-8",
			"url"         :    GLOBAL_INFO.COMMON_REQ_URI,
            "success"     :    function(data){
                alert("Ajax Success!");
            },
            "error"      :    function(request, textStatus, errorThrown){
            },
            "complete" : function(){
            }
        };
        return function(dynamicReqs){
        	if(dynamicReqs && dynamicReqs.length)
        	{
        		var jsonRequestStr = JSON.encode(dynamicReqs);
        		var user_options = {
        			data : {
        				"jsonParam" : jsonRequestStr
        			}
        		};
        		var options = {};
        		$.extend(options, default_options, user_options);
        		options["success"] = function(data)
	            {
	            	var obj = JSON.decode(data);
	            	for (var i = 0; i < dynamicReqs.length; i++)
	                {
	                    if (dynamicReqs[i].dynamicRequestCallback != null)
	                    {
	                        dynamicReqs[i].dynamicRequestCallback(obj[dynamicReqs[i].dynamicDataNodeName]);
	                    }
	                }
	            };
	            //发送请求
	            $.ajax(options);
        	}
        };
    })(),
    //单个请求
    singleReq : (function(){
        var default_options = {
            "type"        :    "post",
            "timeout"     :    "40000",
            "contentType" :    "application/x-www-form-urlencoded; charset=UTF-8",
			"url"         :    GLOBAL_INFO.COMMON_REQ_URI,
			"dataType"    :    "json",
            "success"     :    function(data){
                alert("Ajax Success!");
            },
            "error"      :    function(request, textStatus, errorThrown){
            },
            "complete" : function(){
            }
        };
        return function(user_options){
        	var options = {};
       		$.extend(options, default_options, user_options);
            //发送请求
            $.ajax(options);
        };
    })()
});


var ValidateUtil = {
	validate : (function()
	{
		return function(user_options){
        	$("#" + user_options["targetForm"]).validate({
	    		errorPlacement: function(error, element) {
	    			error.appendTo(element.next());
	    		},
	    		success: function(label) {
			    },
				rules: user_options["rules"],
				messages: user_options["messages"]
			});
        };
	})()
};

//键盘事件
function getKeyCode(e){
    var keyNum = 0;
    try{
		if(window.event){ // IE
			keyNum = e.keyCode;
		}else if(e.which){ // Netscape/Firefox/Opera
			keyNum = e.which;
		}

	}catch (ex){}
	return keyNum;
}
//屏蔽Form提交事件
function returnEvent(e){
    var flag = true;
    try{
		if(window.event){ // IE
			e.returnValue=false;
		}else{ // Netscape/Firefox/Opera
		    if(e.which!=8){
				e.preventDefault();
			}
		}
	}catch (ex){}
}
//去掉左右空格
function trimBlankFunc(str){
    return str.replace(/^\s*|\s*$/g,"");
}




var queryParam = {};
function initToolBar(toolObj){
	var id = toolObj.id;
	var title = toolObj.title;
	var win = toolObj.win;
	var addurl = toolObj.addurl;
	var editurl = toolObj.editurl;
	var viewurl = toolObj.viewurl;
	var deleteurl = toolObj.deleteurl;
	
	var toolbarData = 
	[{
		id:'btnadd',
		text:'添加',
		iconCls:'icon-add',
		handler:function(){
			showAddWindow(title,addurl,win);
		}
	},{
		id:'btnedit',
		text:'修改',
		iconCls:'icon-edit',
		handler:function(){
			showEditWindow(id,title,editurl,win);
		}
	},{
		id:'btnview',
		text:'查看',
		iconCls:'icon-search',
		handler:function(){
			showViewWindow(id,undefined,title,viewurl,win);
		}
	},{
		id:'btncut',
		text:'删除',
		iconCls:'icon-no',
		handler:function(){
			deleteRecord(id,deleteurl);
		}
	},
	'-',{
		id:'btnClearSelections',
		text:'清除选择',
		iconCls:'icon-clear',
		handler:function(){
			$('#'+id).datagrid('clearSelections');
		}
	},
	'-',{
					id:'gridTitle',
					text:'当前已选中行：<span id="selectRowNum">0</span>'
	}];
	return toolbarData;
}
//添加信息窗口
function showAddWindow(title,addurl,win){
	win_setting.title=title;
	XW_dialog.window(addurl,win,'addCallBack');
}
		
//查看信息窗口
function showViewWindow(id,data,title,viewurl,win){
	if(undefined === data)
	{
		var rows = $('#' + id).datagrid("getSelections");
		if($(rows).length < 1 || $(rows).length > 1)
		{
			XW_dialog.alert('',"请选择要查看的记录，只能选取单行查看！");
			return ;
		}
		data = rows[0];
	}
	win_setting.title=title;
	var newUrl = getUrlWithParam(viewurl,data);
	XW_dialog.window(newUrl,win,'viewCallBack');
}
		
//修改信息窗口
function showEditWindow(id,title,editurl,win){
	var rows = $('#' + id).datagrid("getSelections");
	if($(rows).length < 1 || $(rows).length > 1)
	{
		XW_dialog.alert('',"请选择要修改的记录，只能选取单行修改！");
		return ;
	}
	win_setting.title=title;
	var newUrl = getUrlWithParam(editurl,rows[0]);
	XW_dialog.window(newUrl,win,'editCallBack');
}
//删除信息	
function deleteRecord(id,deleteurl){
	var rows = $('#' + id).datagrid("getSelections");
	if($(rows).length < 1 || $(rows).length > 1)
	{
		XW_dialog.alert('',"请选择要删除的记录，只能选取单行删除！");
		return ;
	}			
	XW_dialog.confirm('','请确认是否删除？',
		function(){
			deleteData(rows[0],deleteurl);
	});
}

function deleteData(data,url){
	var newUrl = getUrlWithParam(url,data);
	//发送删除请求
	$.ajax({
	   type: "POST",
	   dataType:'json',
	   url: newUrl,
	   success: function(msg){
	     if(msg.success)
			{
				//删除成功
				XW_dialog.tips(msg.errorMsg,1);
				deleteCallBack();
			}
			else
			{
				XW_dialog.alert('',msg.errorMsg);
			}
	   }
	});
}

function getUrlWithParam(url,data){
	var param = getParameter(data);
	if(url){
		if(url.indexOf ('?') != -1){
			url = url + "&" + param;
		}else{
			url = url + "?" + param;
		}
	}
	return url;
}


function reloadGrid(id){
	$('#' + id).datagrid('reload');
	$('#' + id).datagrid('clearSelections');
}

function querySubmit(id){
	$('#' + id).datagrid('load',getQueryParam());
}

function submitForm(id,url,btnId,fn){
	var fun = document.getElementById(btnId).onclick;
	document.getElementById(btnId).onclick=function(){return false;};
	$('#' + id).form('submit',{
		url: url,
		onSubmit: function(){
			if(fn){
				if(!fn()){
					return false;
				}
			}
			return $(this).form('validate');
		},
		success: function(result){
			var msg = jQuery.parseJSON(result);
			if(msg.success)
			{
				//关闭对话框
				XW_dialog.close();
				//回调opener页面方法
				XW_dialog.callback();
				//提示信息
				XW_dialog.alert('标题',msg.errorMsg);
			}
			else
			{
				XW_dialog.alert('标题',msg.errorMsg);
				document.getElementById(btnId).onclick=fun;
			}
		}	
	});
}		
//初始化Grid
function initGrid(girdObject,title,viewurl,win)
{
	//表格id
	var id = girdObject.id;
	//初始化动态计算高度
	var wHeight = $(this).height();
	var top = $('#'+id).offset().top;
	var height = wHeight - top -20;
	//初始化属性参数
	
	//是否换行，true为一行显示
	var nowrap = isNull(girdObject.nowrap,false);
	//True 就把行条纹化,即奇偶行使用不同背景色
	var striped = isNull(girdObject.striped,true);
	//True 就会自动扩大或缩小列的尺寸以适应表格的宽度并且防止水平滚动。
	var fitColumns = isNull(girdObject.fitColumns,true);
	//从远程站点请求数据的 URL。
	var url = girdObject.url;
	//当请求远程数据时，发送的额外参数。
	var queryParams = girdObject.queryParams;
	//定义可以排序的列。
	var sortName = girdObject.sortName;
	//定义列的排序顺序，只能用 'asc' 或 'desc'。
	var sortOrder = isNull(girdObject.sortOrder,'desc');
	//标识字段。
	var idField = girdObject.idField;
	//True 就会只允许选中一行。
	var singleSelect = isNull(girdObject.singleSelect,true);
	//datagrid 的 column 的配置对象，
	var columns = girdObject.columns;
	//True 就会在 datagrid 的底部显示分页栏。
	var pagination = isNull(girdObject.pagination,true);
	//True 就会显示行号的列。
	var rownumbers  = isNull(girdObject.rownumbers,true);
	//工具栏
	var toolbar = girdObject.toolbar;
	
	$('#'+id).datagrid({
		width:'95%',	
		height:height,
		nowrap: false,
		striped: true,
		fitColumns:true,
		url:url,
		queryParams:queryParams,
		sortName: sortName,
		sortOrder: 'desc',
		remoteSort:false,
		//Grid对应的主键列
		idField:idField,
		singleSelect:true,
		columns:[columns],
		pagination:pagination,
		rownumbers:true,
		toolbar:toolbar,
		onLoadError:function(){
			XW_dialog.alert('',"数据加载失败");
		},
		//双击事件
		onDblClickRow:function(rowIndex,rowData){
			showViewWindow(id,rowData,title,viewurl,win);
			
		},
		onLoadSuccess : function(data){
			if(data.total < 1){
				XW_dialog.tips('未查询到数据！');
			}
		},
		onSelect:function(rowIndex,rowData){
			var selections = $('#grid').datagrid('getSelections');
			$('#selectRowNum')[0].innerHTML = selections.length;
		},
		onUnselect:function(rowIndex,rowData){
			var selections = $('#'+id).datagrid('getSelections');
			$('#selectRowNum')[0].innerHTML = selections.length;
		},
		onSelectAll:function(rowIndex,rowData){
			var selections = $('#'+id).datagrid('getSelections');
			$('#selectRowNum')[0].innerHTML = selections.length;
		},
		onUnselectAll:function(rowIndex,rowData){
			var selections = $('#'+id).datagrid('getSelections');
			$('#selectRowNum')[0].innerHTML = selections.length;
		}
	});
	//设置分页控件  
    var p = $('#'+id).datagrid('getPager');  
    $(p).pagination(PAGE_TEMPLATE);
}

function isNull(value,defaultValue){
	if(value == null || value == undefined || value == ''){
		return defaultValue;
	}else{
		return value;
	}
}

//初始化公共信息
function initCommonInfo(){
	
}

jQuery.extend({
	toJSON: function(object)
	{
     	var type = typeof object;
     	if ('object' == type && object != null) 
     	{
       		if (Array == object.constructor) type = 'array';
       		else if (RegExp == object.constructor) type = 'regexp';
       		else type = 'object';
     	}
     	switch (type) 
     	{
     		case 'undefined':
     		case 'unknown':
       			return;
      			break;
     		case 'function':
     		case 'boolean':
     		case 'regexp':
       		return object.toString();
       		break;
     		case 'number':
       		return isFinite(object) ? object.toString() : 'null';
       		break;
     		case 'string':
       		return '"' + object.replace(/(\\|\")/g, "\\$1").replace(/\n|\r|\t/g, function() {
         	var a = arguments[0];
         	return (a == '\n') ? '\\n': (a == '\r') ? '\\r': (a == '\t') ? '\\t': ""
       			}) + '"';
       		break;
     		case 'object':
       		if (object === null) return 'null';
       		var results = [];
       		for (var property in object) 
       		{
         		var value = jQuery.toJSON(object[property]);
         		if (value !== undefined) results.push(jQuery.toJSON(property) + ':' + value);
       		}
       		return '{' + results.join(',') + '}';
       		break;
     		case 'array':
       		var results = [];
       		for (var i = 0; i < object.length; i++) 
       		{
         		var value = jQuery.toJSON(object[i]);
         		if (value !== undefined) results.push(value);
       		}
       		return '[' + results.join(',') + ']';
       		break;
     }
   } 
});
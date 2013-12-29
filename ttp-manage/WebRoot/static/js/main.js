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

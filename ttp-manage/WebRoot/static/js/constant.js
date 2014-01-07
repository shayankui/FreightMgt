/**
 * 分页标准配置
 */
var PAGE_TEMPLATE = {  
     pageSize: 10,//每页显示的记录条数，默认为10  
     pageList: [10,30,50,100,200,300,400,500],//可以设置每页记录条数的列表  
     beforePageText: '第',//页数文本框前显示的汉字  
     afterPageText: '页    共 {pages} 页',  
     displayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录',  
     onBeforeRefresh:function(){ 
         $(this).pagination('loading'); 
         $(this).pagination('loaded'); 
     }
};

function redirectCallBack(){
	var redirectUrl = XW_dialog.getData("RedirectUrl");
	if(redirectUrl != null){
		window.location = redirectUrl;
	}
}
		    
/**
 * 弹出框，封装 art.Dialog
 */
var XW_dialog = (function (){
	var _dlg = $.dialog;
	return {
		/**
		 * 弹出窗口
		 * @argument url 		iframe页面URL
		 * @argument options	初始化参数
		 * @argument fn			回调函数名称
		 */
		window:function(url,options,fn){
			var _window;
			//window 对象数据适配方法
			var optionsAdapter = function (options){
				var default_win_setting = {
					title : '',
					width:800,
					height:600,
					lock : true ,
					resize : true,
					fixed : true
				};
				if(options){
					if(options.title && options.title != ''){
						default_win_setting.title = options.title;
					}
					if(options.width && options.width != ''){
						default_win_setting.width = options.width;
					}
					if(options.height && options.height != ''){
						default_win_setting.height = options.height;
					}
					if(options.lock != null && options.lock != undefined){
						default_win_setting.lock = options.lock;
					}
					if(options.resize != null && options.resize != undefined){
						default_win_setting.resize = options.resize;
					}
				}
				return default_win_setting;	
			};
			_window = _dlg.open(url, optionsAdapter(options));
			//将回调函数用数据传递过去
			_dlg.data('callback_fn',fn) ;
			return {
				hide : function(){
					_window.hide();
					return _window;
				},
				title : function (title){
					_window.title(title);
					return _window;
				},
				show : function (){
					_window.show();
					return _window;
				},
				content : function (content){
					_window.content(content);
					return _window;
				},
				position : function (left, top){
					_window.position(left, top);
					return _window;
				},
				size : function (width, height){
					_window.size(width, height);
					return _window;
				},
				time : function (time) {
					_window.time(time);
					return _window;
				},
				lock : function(){
					_window.lock();
					return _window;
				},
				unlock : function (){
					_window.unlock();
					return _window;
				}
				
			};
		},
		//警告框
		alert : function(title , content , fn){
			_dlg.alert(content ,fn);
		},
		//确认框
		confirm: function(title,content,ok_fn,no_fn){
			_dlg.confirm(content, ok_fn, no_fn);
		},
		//提示信息
		tips:function(content,time){
			_dlg.tips(content,time);
		},
		close : function (){
			_dlg.close();
		},
		getOpener : function (){
			return _dlg.opener;
		},
		addData : function (name , val){
			_dlg.data(name,val);
		},
		getData : function (name){
			return _dlg.data(name);
		},
		callback : function(){
			var _fn = _dlg.data('callback_fn');
			_dlg.opener[_fn]();
		},
		redirect : function(){
			redirectCallBack();
		},
		refrash : function(){
			window.location.href = window.location.href;
		}
	};
})();


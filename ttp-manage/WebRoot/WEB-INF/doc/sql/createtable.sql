--创建用户及授权
CREATE USER 'ttp'@'localhost' IDENTIFIED BY 'ttp123';

GRANT SELECT, INSERT, UPDATE, REFERENCES, DELETE, CREATE, DROP, ALTER, INDEX, TRIGGER, CREATE VIEW, SHOW VIEW, EXECUTE, ALTER ROUTINE, CREATE ROUTINE, CREATE TEMPORARY TABLES, LOCK TABLES, EVENT ON ttp.* TO 'ttp'@'localhost';

GRANT GRANT OPTION ON ttp.* TO 'ttp'@'localhost';

--系统参数表
CREATE TABLE T_SYSTEM (
		F_CSBM  	VARCHAR(32) 		NOT NULL 		COMMENT '参数编码，主键' ,
		F_CSMC  	VARCHAR(100) 		NOT NULL 		COMMENT '参数名称，不允许重复' ,
		F_CSZ  		VARCHAR(1000) 	NULL 				COMMENT '参数值' ,
		F_BZ  		VARCHAR(1000) 	NULL 				COMMENT '备注信息' ,
		PRIMARY KEY (F_CSBM)
);

--发货方表
CREATE TABLE T_USER_SHIPPER (
		F_USER_ID  						VARCHAR(64) 			NOT NULL 							COMMENT '用户ID,UUID主键',
		F_PASSWD							VARCHAR(64)				NOT NULL							COMMENT '用户密码,md5加密',
		F_NAME   							VARCHAR(100) 			NOT NULL 							COMMENT '用户姓名' ,
		F_CARD_TYPE						INT								NOT NULL	DEFAULT 1 	COMMENT '证件类型,1身份证 2其他 默认1',
		F_CARD   							VARCHAR(32) 			NOT NULL							COMMENT '证件号码' ,
		F_MOBILE  						VARCHAR(20) 			NOT NULL							COMMENT '手机号' ,
		F_PHOTO	  						VARCHAR(1000) 		NULL 									COMMENT '头像,图片url' ,
		F_COMPANY  						VARCHAR(500) 			NULL 									COMMENT '单位名称' ,
		F_STATUS  						INT						 		NOT NULL 	DEFAULT 1		COMMENT '状态 1未认证 2已认证 3正常' ,
		F_PROVINCE_NUM				VARCHAR(100) 			NOT NULL 							COMMENT '用户省份' ,
		F_REGION_NUM					VARCHAR(100) 			NOT NULL 							COMMENT '用户地市' ,
		F_COUNTRY_NUM					VARCHAR(100) 			NOT NULL 							COMMENT '用户区县' ,
		F_contact_address  		VARCHAR(1000) 		NULL 									COMMENT '联系地址（通讯地址）' ,
		f_email	  						VARCHAR(500)	 		NULL 									COMMENT '电子邮箱' ,
		F_TELNUM  						VARCHAR(32)		 		NULL 									COMMENT '固话' ,
		F_CONTACT_USER  			VARCHAR(100)	 		NULL 									COMMENT '备用联系人姓名' ,
		F_CONTACT_MOBILE  		VARCHAR(20)		 		NULL 									COMMENT '备用联系人手机号' ,
		F_CONTACT_TEL  				VARCHAR(32) 			NULL 									COMMENT '备用联系人电话' ,
		F_ATTACH_FILE					VARCHAR(1000)			NULL									COMMENT '用户资质附件',
		F_BUILD_TIME					VARCHAR(20)		 		NOT NULL							COMMENT '用户创建时间' ,
		F_MEMO								VARCHAR(1000) 		NULL 									COMMENT '备注' ,
		PRIMARY KEY (F_USER_ID)
);

--司机表
CREATE TABLE T_USER_DRIVER (
		F_USER_ID  									VARCHAR(64) 			NOT NULL 							COMMENT '用户ID,UUID主键',
		F_PASSWD										VARCHAR(64)				NOT NULL							COMMENT '用户密码,md5加密',
		F_NAME   										VARCHAR(100) 			NOT NULL 							COMMENT '用户姓名' ,
		F_CARD_TYPE									INT								NOT NULL	DEFAULT 1 	COMMENT '证件类型,1身份证 2其他 默认1',
		F_CARD   										VARCHAR(32) 			NOT NULL							COMMENT '证件号码' ,
		F_DIRVING_LICENSE_TYPE			INT					 			NOT NULL	DEFAULT 1		COMMENT '驾照类型 1 A照，2 B照 ，3 C照' ,
		F_DIRVING_LICENSE						VARCHAR(100) 			NOT NULL							COMMENT '驾照号码' ,
		F_MOBILE  									VARCHAR(20) 			NOT NULL							COMMENT '手机号' ,
		F_PHOTO	  									VARCHAR(1000) 		NULL 									COMMENT '头像,图片url' ,
		F_COMPANY  									VARCHAR(500) 			NULL 									COMMENT '单位名称' ,
		F_STATUS  									INT						 		NOT NULL 	DEFAULT 1		COMMENT '状态 1未认证 2已认证 3正常' ,
		F_PROVINCE_NUM							VARCHAR(100) 			NOT NULL 							COMMENT '用户省份' ,
		F_REGION_NUM								VARCHAR(100) 			NOT NULL 							COMMENT '用户地市' ,
		F_COUNTRY_NUM								VARCHAR(100) 			NOT NULL 							COMMENT '用户区县' ,
		F_contact_address  					VARCHAR(1000) 		NULL 									COMMENT '联系地址（通讯地址）' ,
		f_email	  									VARCHAR(500)	 		NULL 									COMMENT '电子邮箱' ,
		F_TELNUM  									VARCHAR(32)		 		NULL 									COMMENT '固话' ,
		F_CONTACT_USER  						VARCHAR(100)	 		NULL 									COMMENT '备用联系人姓名' ,
		F_CONTACT_MOBILE  					VARCHAR(20)		 		NULL 									COMMENT '备用联系人手机号' ,
		F_CONTACT_TEL  							VARCHAR(32) 			NULL 									COMMENT '备用联系人电话' ,
		F_ATTACH_FILE								VARCHAR(1000)			NULL									COMMENT '用户资质附件',
		F_BUILD_TIME								VARCHAR(20)		 		NOT NULL							COMMENT '用户创建时间' ,
		F_MEMO											VARCHAR(1000) 		NULL 									COMMENT '备注' ,
		PRIMARY KEY (F_USER_ID)
);

--车辆表
CREATE TABLE T_DA_TRAIN (
		F_TRAIN_ID  								VARCHAR(64) 			NOT NULL 							COMMENT '车辆ID,UUID主键',
		F_TRAIN_NUM									VARCHAR(64)				NOT NULL							COMMENT '车牌号',
		F_TRAIN_LENGTH							DOUBLE						NULL									COMMENT '车长，单位 m',
		F_TRAIN_WIDTH								DOUBLE						NULL									COMMENT '车宽，单位 m',
		F_TRAIN_HEIGHT							DOUBLE						NULL									COMMENT '车高，单位 m',
		F_TRAIN_SIZE								DOUBLE						NULL									COMMENT '总容积，单位 立方米',
		F_TRAIN_MAX_WEIGHT					DOUBLE						NULL									COMMENT '最大限重，单位kg',
		F_TRAIN_BRAND								VARCHAR(50)				NULL									COMMENT '车辆品牌',
		F_BEEN_RUNNED								INT								NULL									COMMENT '已跑公里数，单位KM',
		F_FACTORY_TIME							VARCHAR(10)				NULL									COMMENT '车辆出厂时间 yyyymmdd',
		F_BUILD_TIME								VARCHAR(20)		 		NOT NULL							COMMENT '车辆创建时间' ,
		F_PIC1											VARCHAR(1000)			NULL									COMMENT '图片1 url',
		F_PIC2											VARCHAR(1000)			NULL									COMMENT '图片2 url',
		F_PIC3											VARCHAR(1000)			NULL									COMMENT '图片3 url',
		F_PIC4											VARCHAR(1000)			NULL									COMMENT '图片4 url',
		F_PIC5											VARCHAR(1000)			NULL									COMMENT '图片5 url',
		F_MEMO											VARCHAR(2000)			NULL									COMMENT '车辆简介',
		PRIMARY KEY (F_TRAIN_ID)
);

--司机-车辆对照表
CREATE TABLE T_DZ_TRAIN_DIRVER (
		F_TRAIN_ID  								VARCHAR(64) 			NOT NULL 							COMMENT '车辆ID,UUID主键',
		F_DRIVER_ID									VARCHAR(64) 			NOT NULL 							COMMENT '司机ID,UUID主键',
		F_STATUS										INT 							NOT NULL DEFAULT 1    COMMENT '关系状态 0不可用 1可用',
		PRIMARY KEY (F_TRAIN_ID,F_DRIVER_ID)
);

--用户帐号
CREATE TABLE T_USER_ACCOUNT (
		F_ACCOUNT_ID  							VARCHAR(64) 			NOT NULL 										COMMENT '账户ID',
		F_USER_ID										VARCHAR(64) 			NOT NULL 										COMMENT '用户ID，包括发货方,司机',
		F_STATUS										INT 							NOT NULL DEFAULT 1    			COMMENT '状态 1不可用 2可用 3其他',
		F_RMB_MONEY									DOUBLE						NOT NULL DEFAULT 0.0  			COMMENT '账户当前余额（兑换成人民币），单位 元，用户自行充值', --【可用总额=F_RMB_MONEY+F_OTHER_MONEY】
		F_OTHER_AMOUNT							DOUBLE 						NOT NULL DEFAULT 0.0				COMMENT '账户当前其他余额（非人民币，如积分，系统赠送等）',
		F_OTHER_MONEY								DOUBLE 						NOT NULL DEFAULT 0.0				COMMENT '账户当前其他余额（非人民币，如积分），兑换成人民币金额，单位 元',
		F_MIN_MONEY									DOUBLE 						NOT NULL DEFAULT 0.0				COMMENT '账户最小金额，单位 元',	
		F_MAX_MONEY									DOUBLE 						NOT NULL DEFAULT 99999999.0	COMMENT '账户最大金额，单位 元',	
		F_BUILD_TIME								VARCHAR(20)				NOT NULL 										COMMENT '账户创建时间 YYYYMMDDHH24MISS',
		PRIMARY KEY (F_ACCOUNT_ID)
);

--账户交易记录 
CREATE TABLE T_ACCOUNT_TRANS_LOG (
		F_LOG_ID										VARCHAR(64)				NOT NULL										COMMENT '充值记录ID，主键 YYYYMMDDHH24MISS+序列',
		F_TRANS_NUM									VARCHAR(64)				NOT NULL										COMMENT '交易流水号',
		F_ACCOUNT_ID  							VARCHAR(64) 			NOT NULL 										COMMENT '本系统发生交易账户ID',
		F_OPT_TYPE									INT								NOT NULL 					 					COMMENT '操作类型,1充值 2消费 3提现',
		F_TRANS_SRC									VARCHAR(100)			NULL												COMMENT '账户交易发起方',
		F_TRANS_SRC_BILL						VARCHAR(100)			NULL												COMMENT '账户交易发起方帐号',
		F_TRANS_DES									VARCHAR(100)			NULL												COMMENT '账户交易接收方',
		F_TRANS_DES_BILL						VARCHAR(100)			NULL												COMMENT '账户交易接收方帐号',
		F_RMB_MONEY									DOUBLE						NOT NULL DEFAULT 0.0  			COMMENT '交易金额，单位 元', --【交易总金额=F_RMB_MONEY+F_OTHER_MONEY】
		F_OTHER_AMOUNT							DOUBLE 						NOT NULL DEFAULT 0.0				COMMENT '交易其他金额数量',
		F_OTHER_MONEY								DOUBLE 						NOT NULL DEFAULT 0.0				COMMENT '交易其他金额，兑换成人民币金额，单位 元',
		F_RESULT_CODE								INT 							NOT NULL DEFAULT 1    			COMMENT '交易状态 0失败 1成功 -1异常',
		F_TRANS_TIME								VARCHAR(20)				NOT NULL 										COMMENT '交易时间',
		F_BUILD_TIME								VARCHAR(20)				NOT NULL 										COMMENT '记录创建时间 YYYYMMDDHH24MISS',
		PRIMARY KEY (F_LOG_ID)
);


--发货地设置
CREATE TABLE T_DELIV_PLACE (
		F_PLACE_ID									VARCHAR(64) 			NOT NULL 							COMMENT '发货地ID，主键',
		F_USER_ID  									VARCHAR(64) 			NOT NULL 							COMMENT '发货方ID',
		F_PROVINCE_NUM							VARCHAR(100) 			NOT NULL 							COMMENT '发货地省份' ,
		F_REGION_NUM								VARCHAR(100) 			NOT NULL 							COMMENT '发货地地市' ,
		F_COUNTRY_NUM								VARCHAR(100) 			NOT NULL 							COMMENT '发货地区县' ,
		F_DETAIL_ADDRESS						VARCHAR(500) 			NULL		 							COMMENT '发货地详细地址' ,
		F_IS_DEFAULT								INT 							NOT NULL DEFAULT 1    COMMENT '是否默认 0否 1是',
		PRIMARY KEY (F_PLACE_ID)
);


--卸货地设置
CREATE TABLE T_DISCHARGE_PLACE (
		F_PLACE_ID									VARCHAR(64) 			NOT NULL 							COMMENT '卸货地ID，主键',
		F_USER_ID  									VARCHAR(64) 			NOT NULL 							COMMENT '司机ID',
		F_PROVINCE_NUM							VARCHAR(100) 			NOT NULL 							COMMENT '卸货地省份' ,
		F_REGION_NUM								VARCHAR(100) 			NOT NULL 							COMMENT '卸货地地市' ,
		F_COUNTRY_NUM								VARCHAR(100) 			NOT NULL 							COMMENT '卸货地区县' ,
		F_DETAIL_ADDRESS						VARCHAR(500) 			NULL		 							COMMENT '卸货地详细地址' ,
		F_IS_DEFAULT								INT 							NOT NULL DEFAULT 1    COMMENT '是否默认 0否 1是',
		F_LAST_TIME									VARCHAR(20)				NOT NULL 							COMMENT '最后一次操作时间 YYYYMMDDHH24MISS',
		PRIMARY KEY (F_PLACE_ID)
);

--货物类型
CREATE TABLE T_GOODS_TYPE (
		F_TYPE_NUM  								VARCHAR(64) 			NOT NULL 							COMMENT '货物类型编码',
		F_TYPE_NAME									VARCHAR(100) 			NOT NULL 							COMMENT '货物类型名称',
		F_TYPE_MEMO									VARCHAR(2000)			NULL 							    COMMENT '货物类型备注',
		PRIMARY KEY (F_TYPE_NUM)
);

--货物
CREATE TABLE T_DA_GOODS (
		F_GOODS_ID									VARCHAR(64) 			NOT NULL 							COMMENT '货物主键',
		F_GOODS_TYPE 								VARCHAR(64) 			NULL 									COMMENT '货物类型',
		F_USER_ID										VARCHAR(64) 			NOT NULL							COMMENT '货物所有者ID',
		F_PIC1											VARCHAR(1000)			NULL									COMMENT '图片1 url',
		F_PIC2											VARCHAR(1000)			NULL									COMMENT '图片2 url',
		F_PIC3											VARCHAR(1000)			NULL									COMMENT '图片3 url',
		F_PIC4											VARCHAR(1000)			NULL									COMMENT '图片4 url',
		F_PIC5											VARCHAR(1000)			NULL									COMMENT '图片5 url',
		F_MEMO											VARCHAR(2000)			NULL									COMMENT '商品简介',
		PRIMARY KEY (F_GOODS_ID)
);

--交易单状态
CREATE TABLE T_ORDER_STATUS (
		F_STATUS_NUM  							VARCHAR(64) 			NOT NULL 							COMMENT '交易单状态编码',
		F_STATUS_NAME								VARCHAR(100) 			NOT NULL 							COMMENT '交易单状态名称',
		F_STATUS_CAPTION						VARCHAR(100) 			NOT NULL 							COMMENT '交易单状态外部展示名称，用于给用户展示',
		F_STATUS_MEMO								VARCHAR(500) 			NOT NULL 							COMMENT '交易单状态备注',
		PRIMARY KEY (F_STATUS_NUM)
);



--交易单主单
CREATE TABLE T_ORDER_MAIN (
		F_ORDER_NUM  								VARCHAR(64) 			NOT NULL 							COMMENT '交易单号',
		F_ORDER_MANCODE							VARCHAR(64) 			NOT NULL 							COMMENT '下单人编码',
		F_ORDER_MANNAME							VARCHAR(100) 			NOT NULL 							COMMENT '下单人名称',								
		F_ORDER_TIME								VARCHAR(20)				NOT NULL 							COMMENT '最后一次操作时间 YYYYMMDDHH24MISS',
		F_TYPE_NAME									VARCHAR(100) 			NOT NULL 							COMMENT '货物类型名称',
		F_TYPE_MEMO									VARCHAR(2000)			NULL 							    COMMENT '货物类型备注',
		PRIMARY KEY (F_ORDER_NUM)
);



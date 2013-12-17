--创建用户及授权
CREATE USER 'ttp'@'localhost' IDENTIFIED BY 'ttp123';

GRANT SELECT, INSERT, UPDATE, REFERENCES, DELETE, CREATE, DROP, ALTER, INDEX, TRIGGER, CREATE VIEW, SHOW VIEW, EXECUTE, ALTER ROUTINE, CREATE ROUTINE, CREATE TEMPORARY TABLES, LOCK TABLES, EVENT ON ttp.* TO 'ttp'@'localhost';

GRANT GRANT OPTION ON ttp.* TO 'ttp'@'localhost';

--系统参数表
CREATE TABLE T_SYSTEM (
F_CSBM  	varchar(32) 		NOT NULL 		COMMENT '参数编码，主键' ,
F_CSMC  	varchar(100) 		NOT NULL 		COMMENT '参数名称，不允许重复' ,
F_CSZ  		varchar(1000) 	NULL 				COMMENT '参数值' ,
F_BZ  		varchar(1000) 	NULL 				COMMENT '备注信息' ,
PRIMARY KEY (F_CSBM)
);

--发货方表
CREATE TABLE T_USER_SHIPPER (
F_USER_ID  						varchar(64) 			NOT NULL 							COMMENT '用户ID,UUID主键',
F_PASSWD							VARCHAR(64)				NOT NULL							COMMENT '用户密码,md5加密',
F_NAME   							varchar(100) 			NOT NULL 							COMMENT '用户姓名' ,
F_CARD_TYPE						INT								NOT NULL	DEFAULT 1 	COMMENT '证件类型,1身份证 2其他 默认1',
F_CARD   							varchar(32) 			NOT NULL							COMMENT '证件号码' ,
F_MOBILE  						varchar(20) 			NOT NULL							COMMENT '手机号' ,
F_PHOTO	  						varchar(1000) 		NULL 									COMMENT '头像,图片url' ,
F_COMPANY  						varchar(500) 			NULL 									COMMENT '单位名称' ,
F_STATUS  						INT						 		NOT NULL 	DEFAULT 1		COMMENT '状态 1未认证 2已认证 3正常' ,
F_contact_address  		varchar(1000) 		NULL 									COMMENT '联系地址（通讯地址）' ,
f_email	  						varchar(500)	 		NULL 									COMMENT '电子邮箱' ,
F_TELNUM  						varchar(32)		 		NULL 									COMMENT '固化' ,
F_CONTACT_USER  			varchar(100)	 		NULL 									COMMENT '备用联系人姓名' ,
F_CONTACT_MOBILE  		varchar(20)		 		NULL 									COMMENT '备用联系人手机号' ,
F_CONTACT_TEL  				varchar(32) 			NULL 									COMMENT '备用联系人电话' ,
F_ATTACH_FILE					VARCHAR(1000)			NULL									COMMENT '用户资质附件',
F_MEMO								varchar(1000) 		NULL 									COMMENT '备注' ,
PRIMARY KEY (F_USER_ID)
);
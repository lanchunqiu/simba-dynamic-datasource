-- 系统用户
CREATE TABLE `sys_user`
(
  `user_id`     bigint      NOT NULL AUTO_INCREMENT,
  `username`    varchar(50) NOT NULL COMMENT '用户名',
  `password`    varchar(100) COMMENT '密码',
  `salt`        varchar(20) COMMENT '盐',
  `email`       varchar(100) COMMENT '邮箱',
  `mobile`      varchar(100) COMMENT '手机号',
  `status`      tinyint COMMENT '状态  0：禁用   1：正常',
  `dept_id`     bigint(20) COMMENT '部门ID',
  `create_time` datetime COMMENT '创建时间',
  PRIMARY KEY (`user_id`),
  UNIQUE INDEX (`username`)
) ENGINE=`InnoDB` DEFAULT CHARACTER SET utf8mb4 COMMENT='系统用户';

-- 初始化数据：admin/admin
INSERT INTO `sys_user` (`user_id`, `username`, `password`, `salt`, `email`, `mobile`, `status`, `dept_id`, `create_time`) VALUES ('1', 'admin', 'e1153123d7d180ceeb820d577ff119876678732a68eef4e6ffc0b1f06a01f91b', 'YzcmCZNvbXocrsz9dm8e', 'root@163.com', '12345678', '1', '1', '2016-11-11 11:11:11');
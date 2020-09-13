CREATE TABLE sys_user
(
  user_id     bigserial,
  username    varchar(50) NOT NULL,
  password    varchar(100),
  salt        varchar(20),
  email       varchar(100),
  mobile      varchar(100),
  status      int,
  dept_id     int8,
  create_time timestamp,
  PRIMARY KEY (user_id),
  UNIQUE (username)
);

-- 初始化数据：admin/admin
INSERT INTO sys_user (user_id, username, password, salt, email, mobile, status, dept_id, create_time) VALUES ('1', 'admin', 'e1153123d7d180ceeb820d577ff119876678732a68eef4e6ffc0b1f06a01f91b', 'YzcmCZNvbXocrsz9dm8e', 'root@163.com', '12345678', '1', '1', '2016-11-11 11:11:11');
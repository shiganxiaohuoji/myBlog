create database myblog;
use myblog;
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '密码',
--   `nickname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '昵称',
--   `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '头像地址',
--   `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '邮箱',
--   `create_time` datetime(0) NOT NULL COMMENT '创建时间',
--   `update_time` datetime(0) NOT NULL COMMENT '更新时间',
--   `role` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '角色访问权限',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

insert into `user` value (1,'ww','123456');
insert into `user` value (2,'yy','123321123321');
insert into `user` value (3,'xx','12342345');


SET SQL_SAFE_UPDATES= 0;

alter table user add primary key(id);

create table `list`(
	`id` bigint(0) primary key NOT NULL auto_increment  ,
    `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '分类名称'
);


create table `taglist`(
	`id` bigint(0) primary key NOT NULL auto_increment  ,
    `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '分类名称'
)

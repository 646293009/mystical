/******************************************************/
/******          Express MySQL Init SQL          ******/
/****** @Author: Arthur                          ******/
/****** @Version: 1.0.0 2020-08-03               ******/
/****** @Since: 1.0.0                            ******/
/******************************************************/
-- 创建并使用数据库：express_db
drop database if exists express_db;
create database express_db character set 'utf8mb4';
use express_db;

-- 实现基于角色的权限管理系统数据表
-- 功能权限表：sys_menu
drop table if exists sys_menu;
create table sys_menu(
    id int (10) not null auto_increment comment '主键',
    parent_id int (10) comment '上级菜单',
    name varchar(255) comment '菜单名称',
    url varchar(500) comment '菜单链接',
    icon varchar(100) comment '菜单图标',
    create_time timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    update_time timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key(id)
)Engine=InnoDB charset='utf8mb4' comment='系统菜单表';
insert into sys_menu(parent_id, name, url, icon) values(null, '系统管理', '', '');
insert into sys_menu(parent_id, name, url, icon) values(null, '揽件管理', '', '');
insert into sys_menu(parent_id, name, url, icon) values(null, '运输管理', '', '');
insert into sys_menu(parent_id, name, url, icon) values(null, '派送管理', '', '');
insert into sys_menu(parent_id, name, url, icon) values(null, '历史记录', '', '');
insert into sys_menu(parent_id, name, url, icon) values(1, '用户管理', '', '');
insert into sys_menu(parent_id, name, url, icon) values(1, '角色管理', '', '');
insert into sys_menu(parent_id, name, url, icon) values(1, '我的信息', '', '');
insert into sys_menu(parent_id, name, url, icon) values(2, '揽件管理', '', '');
insert into sys_menu(parent_id, name, url, icon) values(3, '运输管理', '', '');
insert into sys_menu(parent_id, name, url, icon) values(4, '配送管理', '', '');
insert into sys_menu(parent_id, name, url, icon) values(5, '历史记录', '', '');

-- 角色信息表：sys_role
drop table if exists sys_role;
create table sys_role(
    id int (10) not null auto_increment comment '主键',
    name varchar(255) comment '角色名称',
    create_time timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    update_time timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key(id)
)Engine=InnoDB charset='utf8mb4' comment='系统角色表';
insert into sys_role(name) values('管理员');
insert into sys_role(name) values('揽件员');
insert into sys_role(name) values('运输员');
insert into sys_role(name) values('配送员');

-- 角色信息中间表：sys_role_menu
drop table if exists sys_role_menu;
create table sys_role_menu(
    role_id int (10) comment '角色主键',
    menu_id int (10) comment '菜单主键',
    create_time timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    update_time timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间'
)Engine=InnoDB charset='utf8mb4' comment='角色菜单表';
insert into sys_role_menu(role_id, menu_id) values(1, 1);
insert into sys_role_menu(role_id, menu_id) values(1, 2);
insert into sys_role_menu(role_id, menu_id) values(1, 3);
insert into sys_role_menu(role_id, menu_id) values(1, 4);
insert into sys_role_menu(role_id, menu_id) values(1, 5);
insert into sys_role_menu(role_id, menu_id) values(1, 6);
insert into sys_role_menu(role_id, menu_id) values(1, 7);
insert into sys_role_menu(role_id, menu_id) values(1, 8);
insert into sys_role_menu(role_id, menu_id) values(1, 9);
insert into sys_role_menu(role_id, menu_id) values(1, 10);
insert into sys_role_menu(role_id, menu_id) values(1, 11);
insert into sys_role_menu(role_id, menu_id) values(1, 12);
insert into sys_role_menu(role_id, menu_id) values(2, 1);
insert into sys_role_menu(role_id, menu_id) values(2, 2);
insert into sys_role_menu(role_id, menu_id) values(2, 5);
insert into sys_role_menu(role_id, menu_id) values(2, 8);
insert into sys_role_menu(role_id, menu_id) values(2, 9);
insert into sys_role_menu(role_id, menu_id) values(2, 12);
insert into sys_role_menu(role_id, menu_id) values(3, 1);
insert into sys_role_menu(role_id, menu_id) values(3, 3);
insert into sys_role_menu(role_id, menu_id) values(3, 5);
insert into sys_role_menu(role_id, menu_id) values(3, 8);
insert into sys_role_menu(role_id, menu_id) values(3, 10);
insert into sys_role_menu(role_id, menu_id) values(3, 12);
insert into sys_role_menu(role_id, menu_id) values(4, 1);
insert into sys_role_menu(role_id, menu_id) values(4, 4);
insert into sys_role_menu(role_id, menu_id) values(4, 5);
insert into sys_role_menu(role_id, menu_id) values(4, 8);
insert into sys_role_menu(role_id, menu_id) values(4, 11);
insert into sys_role_menu(role_id, menu_id) values(4, 12);

-- 用户信息：sys_user
drop table if exists sys_user;
create table sys_user(
    id int (10) not null auto_increment comment '主键',
    name varchar(255) comment '用户名称',
    cellphone varchar(100) comment '手机号码',
    password varchar(500) comment '登录密码',
    role_id int (10) comment '用户角色',
    id_card varchar(100) comment '身份证号码',
    avatar varchar(500) comment '用户头像',
    status int (2) comment '用户状态：0-禁用，1-启用',
    create_time timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    update_time timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key(id)
)Engine=InnoDB charset='utf8mb4' comment='系统菜单表';
insert into sys_user(name, cellphone, password, role_id, status) values('王铁锤', '15235134818', '21232f297a57a5a743894a0e4a801fc3', 1, 1);

-- 快递信息表：sys_express
drop table if exists sys_express;
create table sys_express(
    id int (10) not null auto_increment comment '主键',
    no varchar(255) comment '快递编号',
    send_name varchar(255) comment '寄件人姓名',
    send_cellphone varchar(100) comment '寄件人手机号码',
    send_address varchar(500) comment '寄件地址',
    receive_name varchar(255) comment '收件人姓名',
    receive_cellphone varchar(100) comment '收件人手机号码',
    receive_address varchar(500) comment '收件地址',
    send_date datetime comment '寄件时间',
    begin_transport_date datetime comment '运输开始时间',
    end_transport_date datetime comment '运输到达时间',
    delivery_date datetime comment '配送时间',
    receive_date datetime comment '收件时间',
    status int(2) comment '快件状态：0-已揽件，1-开始运输，2-运输到达，3-快件配送，4-已收件',
    create_time timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    update_time timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key(id)
)Engine=InnoDB charset='utf8mb4' comment='系统菜单表';
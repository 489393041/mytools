drop table if exists `test`;
create table `test`(
    `id` bigint not null comment 'id',
    `password` varchar(50) comment '密码',
    `name` varchar(50) comment '名称',
    primary key (`id`)
)engine = innodb default charset = utf8mb4;

insert into `test` values (1,'12345','测试');
select * from test;

drop table if exists `demo`;
create table `demo`(
    `id` bigint not null comment 'id',
    `name` varchar(50) comment '名称',
    primary key (`id`)
)engine = innodb default charset = utf8mb4;

insert into `demo` values (1,'测试');
select * from demo;



drop table if exists `ebook`;
create table `ebook`(
    `id` bigint not null comment 'id',
    `name` varchar(50) comment '名称',
    `category1_id` bigint comment '分类1',
    `category2_id` bigint comment '分类2',
    `description` varchar(200) comment '描述',
    `cover` varchar(200) comment '封面',
    `doc_count` int comment '文档数',
    `view_count` int comment '阅读数',
    `vote_count` int comment '点赞数',
    primary key (`id`)
)engine = innodb default charset = utf8mb4 comment '电子书';

insert into `ebook` (id,name,description) values (1,'Spring Boot 入门教程','零基础入门java开发，企业级应用首选框架');
insert into `ebook` (id,name,description) values (2,'Vue 入门教程','零基础入门Vue开发，企业级应用首选框架');
insert into `ebook` (id,name,description) values (3,'MySql 入门教程','零基础入门MySql开发，企业级应用首选框架');


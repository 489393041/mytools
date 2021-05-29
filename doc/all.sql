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




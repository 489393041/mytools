drop table if exists `test`;
create table `test`(
    `id` bigint not null comment 'id',
    `password` varchar(50) comment '密码',
    `name` varchar(50) comment '名称',
    primary key (`id`)
)engine = innodb default charset = utf8mb4;

select * from test;

insert into `test` values (1,'12345','测试');
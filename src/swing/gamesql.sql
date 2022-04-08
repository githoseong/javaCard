
show databases;
use javagreen11;
show tables;
create table game (
	idx int not null auto_increment primary key,
	id varchar(20) not null,
	pwd varchar(20) not null,
	mail varchar(20) not null,
	champ varchar(10) default '없음'
);
desc game;
select * from game;	
alter table game modify champ varchar(100)
alter table game add win int not null default 0;
alter table game add lose int not null default 0;


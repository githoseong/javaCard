show databases;
use javagreen;
create table game (
	idx int not null auto_increment primary key,
	id varchar(20) not null,
	pwd varchar(20) not null,
	mail varchar(20) not null,
	champ varchar(10) 
);
desc game;
alter table game alter column champ set default '없음';
select * from game;
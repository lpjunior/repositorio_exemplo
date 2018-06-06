create database if not exists banco_teste;

use banco_teste;

create table produto(
	id int primary key auto_increment,
	nmProduto varchar(150) not null,
	quantidade int not null
);
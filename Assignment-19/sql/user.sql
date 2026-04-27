create database user_db;

use user_db;

create table users (
  id int primary key,
  username varchar(50),
  email varchar(100),
  password varchar(100)
);

delimiter $$

create procedure insert_user (
  in u_id int,
  in u_name varchar(50),
  in u_email varchar(100),
  in u_password varchar(100)
)
begin
insert into users(id, username, email, password)
values (u_id, u_name, u_email, u_password);
end $$

delimiter ;
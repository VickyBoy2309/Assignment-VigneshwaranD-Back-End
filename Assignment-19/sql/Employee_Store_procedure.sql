use employee_db

Delimiter $$

create procedure add_employee(
  in e_id int,
  in e_name varchar(50),
  in e_salary double
)
begin
insert into employee(id, name, salary)
values (e_id, e_name, e_salary);
end $$

delimiter;
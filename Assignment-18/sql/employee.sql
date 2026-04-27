create database employee_db;

create table employee (
  id int primary key,
  name varchar(50),
  department varchar(50),
  salary float
);

INSERT INTO employee (id, name, department, salary) VALUES
(1, 'Arjun', 'IT', 50000),
(2, 'Meena', 'HR', 45000),
(3, 'Karthik', 'IT', 55000),
(4, 'Divya', 'Finance', 60000);

select * from employee;

use employee_db
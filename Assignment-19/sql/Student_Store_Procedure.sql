delimiter $$

create procedure insert_student(
  in s_id int,
  in s_name varchar(50),
  in s_marks int
)
begin
insert into students(id, name, marks)
values(s_id, s_name, s_marks);
end $$

delimiter ;

show procedure status where db = 'student_db';

use student_db;

delimiter $$

create procedure update_stud_marks(
  in s_id int,
  in new_marks int
)
begin
update students
set marks = new_marks
where id = s_id;
end $$

delimiter;
use database student_id;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    marks FLOAT
);

INSERT INTO students (id, name, marks) VALUES (1, 'Vicky', 85.5);

select * from students;
CREATE TABLE employees (
    emp_id SERIAL PRIMARY KEY,
    emp_name VARCHAR,
    dept_id INT,
    salary float,
    hire_date DATE,
    gender VARCHAR,
    city VARCHAR
);

drop table employees
drop table departments

CREATE TABLE departments (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR,
    location VARCHAR,
    manager_id INT
);

INSERT INTO employees
(emp_id, emp_name, dept_id, salary, hire_date, gender, city)
VALUES
(1, 'Veera', 10, 60000, '15-1-26', 'M', 'Madurai'),
(2, 'Kannan', 20, 55000, '25-1-26', 'M', 'Bangalore'),
(3, 'Rajesh', 10, 70000, '15-4-26', 'M', 'Chennai'),
(4, 'Mohana', 30, 65000, '1-10-26', 'F', 'Hyderabad'),
(5, 'Nitheesh', 20, 50000, '5-1-26', 'M', 'Madurai');

INSERT INTO departments (dept_id, dept_name, location, manager_id)
VALUES
(10, 'IT', 'Madurai', 1),
(20, 'HR', 'Bangalore', 2),
(30, 'Finance', 'Chennai', 4);

SELECT * FROM employees
SELECT * FROM departments


7 th Question
create or replace function total (in_dept_id INT)
returns INT
language plpgsql
as $$
declare total_sal int;
begin 
select sum(salary) into total_sal from employees where dept_id=in_dept_id;
return total_sal;
end;
$$;
select total (10)

9th Question
select * from employees where emp_id not in (select manager_id from departments where manager_id is not null);

2nd Question
select emp_name from employees e where salary>(select avg(salary)from employees where dept_id=e.dept_id);


1st Question
SELECT  e.emp_id,e.emp_name,d.dept_name,d.location
FROM employees e
JOIN departments d ON e.dept_id = d.dept_id;

5th Question
select * from employees
where hire_date >(select avg(hire_date) from employees);


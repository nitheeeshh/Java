drop table bio_data
create table bio_data(id int primary key,name varchar,dob varchar,gender varchar,phn_num bigint unique,age int check(age>18),salary decimal default(0))
select * from bio_data
select * from bio_datas
alter table bio_data rename column salary to income 
alter table bio_data alter column age type smallint
alter table bio_data drop gender
alter table bio_data add column gender varchar(10) not null
alter table bio_data alter column gender drop not null
insert into bio_data values (1,'Nitheesh',2003,'Male',9876543210,22,30000)
insert into bio_datas values (1,'Nitheesh','Male',9876543210)
create table bio_datas(id int primary key,name varchar,gender varchar,phn_num bigint unique)


-- Create Tables
CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(100),
    city VARCHAR(50)
);

CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_id INT REFERENCES customers(customer_id),
    amount NUMERIC(10, 2)
);

CREATE TABLE departments (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50)
);

CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(100),
    dept_id INT REFERENCES departments(dept_id),
    salary NUMERIC(10, 2)
);

-- Insert Sample Data
INSERT INTO customers VALUES 
(1, 'Alice Smith', 'New York'),
(2, 'Bob Jones', 'Chicago'),
(3, 'Charlie Brown', 'Boston');

INSERT INTO orders VALUES 
(101, 1, 6000),
(102, 2, 4500),
(103, 1, 8000),
(104, 3, 3000);

INSERT INTO departments VALUES 
(1, 'HR'),
(2, 'IT'),
(3, 'Finance');

INSERT INTO employees VALUES 
(201, 'David Miller', 1, 35000),
(202, 'Eva Adams', 2, 40000),
(203, 'Frank Wright', 1, 28000);
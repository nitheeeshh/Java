CREATE TABLE employee (
    emp_id SERIAL PRIMARY KEY,
    emp_name VARCHAR(50) NOT NULL,
    gender VARCHAR(10),
    department VARCHAR(30),
    designation VARCHAR(30),
    salary NUMERIC(10,2),
    city VARCHAR(30),
    joining_date DATE,
    status VARCHAR(15)
);

drop table employee


INSERT INTO employee VALUES (1,'Arun','Male','IT','Developer',35000,'Chennai','2024-01-01','Active');
INSERT INTO employee VALUES (2,'Priya','Female','HR','Executive',30000,'Madurai','2024-01-02','Active');
INSERT INTO employee VALUES (3,'Karthik','Male','Finance','Analyst',40000,'Coimbatore','2024-01-03','Active');
INSERT INTO employee VALUES (4,'Divya','Female','Sales','Manager',50000,'Trichy','2024-01-04','Active');
INSERT INTO employee VALUES (5,'Vijay','Male','Marketing','Executive',32000,'Salem','2024-01-05','Inactive');
INSERT INTO employee VALUES (6,'Anitha','Female','IT','Developer',36000,'Erode','2024-01-06','Active');
INSERT INTO employee VALUES (7,'Rahul','Male','HR','Manager',48000,'Chennai','2024-01-07','Active');
INSERT INTO employee VALUES (8,'Sneha','Female','Finance','Executive',33000,'Madurai','2024-01-08','Active');
INSERT INTO employee VALUES (9,'Suresh','Male','Sales','Executive',31000,'Coimbatore','2024-01-09','Inactive');
INSERT INTO employee VALUES (10,'Meena','Female','Marketing','Analyst',39000,'Trichy','2024-01-10','Active');
INSERT INTO employee VALUES (11,'Ramesh','Male','IT','Developer',37000,'Salem','2024-01-11','Active');
INSERT INTO employee VALUES (12,'Kavitha','Female','HR','Executive',30500,'Erode','2024-01-12','Active');
INSERT INTO employee VALUES (13,'Manoj','Male','Finance','Manager',55000,'Chennai','2024-01-13','Active');
INSERT INTO employee VALUES (14,'Lakshmi','Female','Sales','Executive',31500,'Madurai','2024-01-14','Inactive');
INSERT INTO employee VALUES (15,'Hari','Male','Marketing','Manager',52000,'Coimbatore','2024-01-15','Active');
INSERT INTO employee VALUES (16,'Nisha','Female','IT','Analyst',41000,'Trichy','2024-01-16','Active');
INSERT INTO employee VALUES (17,'Ajith','Male','HR','Executive',29500,'Salem','2024-01-17','Active');
INSERT INTO employee VALUES (18,'Deepa','Female','Finance','Developer',42000,'Erode','2024-01-18','Active');
INSERT INTO employee VALUES (19,'Saravanan','Male','Sales','Manager',51000,'Chennai','2024-01-19','Inactive');
INSERT INTO employee VALUES (20,'Pooja','Female','Marketing','Executive',32500,'Madurai','2024-01-20','Active');




INSERT INTO employee
(emp_id, emp_name, gender, department, designation, salary, city, joining_date, status)
VALUES
(21, 'Aravind', 'Male', 'IT', 'Software Engineer', 47000.00, 'Madurai', '2023-07-12', 'Active'),
(22, 'Lakshmi', 'Female', 'HR', 'HR Manager', 62000.00, 'Chennai', '2021-04-18', 'Active'),
(23, 'Gokul', 'Male', 'Finance', 'Financial Analyst', 52000.00, 'Coimbatore', '2022-09-15', 'Active'),
(24, 'Pavithra', 'Female', 'Testing', 'Manual Tester', 39000.00, 'Salem', '2024-01-10', 'Active'),
(25, 'Sathish', 'Male', 'Support', 'Support Executive', 34000.00, 'Trichy', '2023-05-22', 'Inactive'),
(26, 'Revathi', 'Female', 'Marketing', 'Content Writer', 43000.00, 'Erode', '2022-11-08', 'Active'),
(27, 'Kishore', 'Male', 'IT', 'Java Developer', 56000.00, 'Madurai', '2021-08-14', 'On Leave'),
(28, 'Janani', 'Female', 'Admin', 'Admin Executive', 36000.00, 'Chennai', '2023-02-27', 'Active'),
(29, 'Bharath', 'Male', 'Sales', 'Sales Executive', 41000.00, 'Virudhunagar', '2022-12-19', 'Active'),
(30, 'Monika', 'Female', 'Finance', 'Accountant', 46000.00, 'Coimbatore', '2020-10-30', 'Active'),
(31, 'Dinesh', 'Male', 'IT', 'Backend Developer', 59000.00, 'Salem', '2021-06-17', 'Active'),
(32, 'Shalini', 'Female', 'Testing', 'Automation Tester', 53000.00, 'Madurai', '2022-08-24', 'Active'),
(33, 'Vijay', 'Male', 'Marketing', 'Digital Marketer', 44000.00, 'Chennai', '2023-09-09', 'Inactive'),
(34, 'Aishwarya', 'Female', 'Support', 'Customer Support', 35000.00, 'Trichy', '2024-03-13', 'Active'),
(35, 'Kiran', 'Male', 'HR', 'Recruiter', 40000.00, 'Erode', '2021-12-01', 'On Leave'),
(36, 'Swetha', 'Female', 'IT', 'UI/UX Designer', 51000.00, 'Coimbatore', '2022-04-16', 'Active'),
(37, 'Prakash', 'Male', 'Finance', 'Finance Manager', 68000.00, 'Madurai', '2019-07-21', 'Active'),
(38, 'Nivetha', 'Female', 'Sales', 'Sales Coordinator', 37000.00, 'Salem', '2023-06-28', 'Active'),
(39, 'Hariharan', 'Male', 'IT', 'DevOps Engineer', 70000.00, 'Chennai', '2020-05-05', 'Active'),
(40, 'Yamini', 'Female', 'Marketing', 'Marketing Manager', 65000.00, 'Tirunelveli', '2021-01-18', 'Active');


explain analyse
select * from employee where emp_name='Yamini'


create index searchname1
on employee(emp_name);
explain analyse
select * from employee where emp_name='Yamini'







explain analyse
select * from employee where salary =70000


create index sal on employee(salary);
explain analyse
select * from employee where salary =70000






create or replace view accountsview as 
select emp_id,emp_name,salary,department from employee


select * from accountsview


CREATE TABLE sales (
    sale_id INT PRIMARY KEY,
    emp_id INT,
    total_sales NUMERIC,
    FOREIGN KEY (emp_id)
        REFERENCES employee(emp_id)
);

INSERT INTO sales VALUES
(1, 1, 10000),
(2, 2, 15000),
(3, 3, 20000),
(4, 4, 12000),
(5, 5, 18000),
(6, 6, 25000),
(7, 7, 17000),
(8, 8, 22000),
(9, 9, 30000)



create or replace view onlysales as
select e.emp_name,e.emp_id,e.department,s.total_sales from employee e
inner join sales s on e.emp_id=s.emp_id

select * from onlysales
---------------------------------------------------------
-- QUESTION 1
-- Create bank_account table, insert records,
-- update balance and rollback
---------------------------------------------------------

DROP TABLE IF EXISTS bank_account;

CREATE TABLE bank_account (
    account_id SERIAL PRIMARY KEY,
    account_holder VARCHAR(50),
    balance NUMERIC(10,2)
);

INSERT INTO bank_account(account_holder,balance)
VALUES
('Ravi',5000),
('Priya',8000),
('Kumar',12000);

SELECT * FROM bank_account;

BEGIN;

UPDATE bank_account
SET balance = balance + 2000
WHERE account_id = 1;

SELECT * FROM bank_account;

ROLLBACK;

SELECT * FROM bank_account;


---------------------------------------------------------
-- QUESTION 2
-- Create employee table, view and grant permission
---------------------------------------------------------

DROP TABLE IF EXISTS employee;

CREATE TABLE employee(
    emp_id SERIAL PRIMARY KEY,
    emp_name VARCHAR(50),
    department VARCHAR(30),
    salary NUMERIC(10,2)
);

INSERT INTO employee(emp_name,department,salary)
VALUES
('Arun','HR',30000),
('Meena','IT',45000),
('John','Finance',40000);

CREATE OR REPLACE VIEW employee_name_view AS
SELECT emp_name
FROM employee;

CREATE USER guest WITH PASSWORD 'guest123';

GRANT SELECT
ON employee_name_view
TO guest;


---------------------------------------------------------
-- QUESTION 3
-- Menu Driven Program using PL/pgSQL
---------------------------------------------------------

CREATE OR REPLACE PROCEDURE view_menu(choice INT)
LANGUAGE plpgsql
AS
$$
BEGIN

CASE choice

WHEN 1 THEN

    EXECUTE '
    CREATE OR REPLACE VIEW employee_view AS
    SELECT emp_id,emp_name,salary
    FROM employee';

    RAISE NOTICE 'View Created';

WHEN 2 THEN

    RAISE NOTICE 'Use: SELECT * FROM employee_view;';

WHEN 3 THEN

    UPDATE employee
    SET salary = salary + 1000
    WHERE emp_id = 1;

    RAISE NOTICE 'Data Updated Through View';

WHEN 4 THEN

    DROP VIEW IF EXISTS employee_view;

    RAISE NOTICE 'View Dropped';

WHEN 5 THEN

    RAISE NOTICE 'Program Exited';

ELSE

    RAISE NOTICE 'Invalid Choice';

END CASE;

END;
$$;

-- Execution Examples
CALL view_menu(1);
SELECT * FROM employee_view;
CALL view_menu(3);
SELECT * FROM employee_view;
CALL view_menu(4);


---------------------------------------------------------
-- TRANSPORT COMPANY DATABASE
---------------------------------------------------------

DROP DATABASE IF EXISTS transport_company;
CREATE DATABASE transport_company;

-- Connect to transport_company before executing below


---------------------------------------------------------
-- Tables
---------------------------------------------------------

CREATE TABLE vehicle_details(
    vehicle_id SERIAL PRIMARY KEY,
    vehicle_name VARCHAR(50),
    vehicle_number VARCHAR(20),
    capacity INT
);

CREATE TABLE delivery_details(
    delivery_id SERIAL PRIMARY KEY,
    product_name VARCHAR(50),
    shop_name VARCHAR(50),
    delivery_area VARCHAR(50),
    status VARCHAR(20)
);

---------------------------------------------------------
-- View for completed deliveries
---------------------------------------------------------

CREATE OR REPLACE VIEW completed_deliveries AS
SELECT *
FROM delivery_details
WHERE status='Completed';


---------------------------------------------------------
-- Index
---------------------------------------------------------

CREATE INDEX idx_delivery_area
ON delivery_details(delivery_area);


---------------------------------------------------------
-- Insert records and COMMIT
---------------------------------------------------------

BEGIN;

INSERT INTO delivery_details(product_name,shop_name,delivery_area,status)
VALUES
('Rice','ABC Stores','Madurai','Completed'),
('Oil','XYZ Mart','Chennai','Pending'),
('Sugar','Fresh Mart','Coimbatore','Completed');

COMMIT;

SELECT * FROM delivery_details;


---------------------------------------------------------
-- Delete and Rollback
---------------------------------------------------------

BEGIN;

DELETE FROM delivery_details
WHERE delivery_id=2;

ROLLBACK;

SELECT * FROM delivery_details;


---------------------------------------------------------
-- Create User and Grant Permission
---------------------------------------------------------

CREATE USER transport_user
WITH PASSWORD 'transport123';

GRANT SELECT
ON delivery_details
TO transport_user;


---------------------------------------------------------
-- Verify View
---------------------------------------------------------

SELECT * FROM completed_deliveries;
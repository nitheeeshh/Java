-- ============================================
-- Employee Management System using
-- Stored Procedure and Triggers (MySQL)
-- ============================================

-- Create Database
CREATE DATABASE IF NOT EXISTS employee_db;
USE employee_db;

-- Drop existing objects
DROP TRIGGER IF EXISTS before_insert_employee;
DROP TRIGGER IF EXISTS before_update_employee;
DROP PROCEDURE IF EXISTS employee_menu;
DROP TABLE IF EXISTS employee;

-- Create Employee Table
CREATE TABLE employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(100),
    salary DECIMAL(10,2)
);

-- ============================================
-- BEFORE INSERT Trigger
-- If salary < 10000, automatically set to 10000
-- ============================================

DELIMITER $$

CREATE TRIGGER before_insert_employee
BEFORE INSERT ON employee
FOR EACH ROW
BEGIN
    IF NEW.salary < 10000 THEN
        SET NEW.salary = 10000;
    END IF;
END$$

DELIMITER ;

-- ============================================
-- BEFORE UPDATE Trigger
-- Restrict salary update below 10000
-- ============================================

DELIMITER $$

CREATE TRIGGER before_update_employee
BEFORE UPDATE ON employee
FOR EACH ROW
BEGIN
    IF NEW.salary < 10000 THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Salary cannot be less than 10000';
    END IF;
END$$

DELIMITER ;

-- ============================================
-- Menu Driven Stored Procedure
-- Choice:
-- 1 - Insert
-- 2 - Update Salary
-- 3 - Delete
-- 4 - Display
-- 5 - Exit
-- ============================================

DELIMITER $$

CREATE PROCEDURE employee_menu(
    IN ch INT,
    IN p_emp_id INT,
    IN p_emp_name VARCHAR(100),
    IN p_salary DECIMAL(10,2)
)
BEGIN

    CASE ch

        WHEN 1 THEN
            INSERT INTO employee(emp_id, emp_name, salary)
            VALUES(p_emp_id, p_emp_name, p_salary);

            SELECT 'Employee Inserted Successfully' AS Message;

        WHEN 2 THEN
            UPDATE employee
            SET salary = p_salary
            WHERE emp_id = p_emp_id;

            SELECT 'Salary Updated Successfully' AS Message;

        WHEN 3 THEN
            DELETE FROM employee
            WHERE emp_id = p_emp_id;

            SELECT 'Employee Deleted Successfully' AS Message;

        WHEN 4 THEN
            SELECT * FROM employee;

        WHEN 5 THEN
            SELECT 'Program Exited' AS Message;

        ELSE
            SELECT 'Invalid Choice' AS Message;

    END CASE;

END$$

DELIMITER ;

-- ============================================
-- Sample Procedure Calls
-- ============================================

-- Insert Employee
CALL employee_menu(1,101,'Arun',8000);
-- Salary becomes 10000 automatically

CALL employee_menu(1,102,'Karthik',25000);

-- Display Records
CALL employee_menu(4,NULL,NULL,NULL);

-- Update Salary
CALL employee_menu(2,102,NULL,30000);

-- This will generate an error
CALL employee_menu(2,102,NULL,9000);

-- Delete Employee
CALL employee_menu(3,101,NULL,NULL);

-- Display Again
CALL employee_menu(4,NULL,NULL,NULL);

-- Exit
CALL employee_menu(5,NULL,NULL,NULL);
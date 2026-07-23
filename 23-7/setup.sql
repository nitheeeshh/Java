-- 1. Create a database named school
CREATE DATABASE school;

-- Switch to the school database
USE school;

-- 2. Create a table named student
CREATE TABLE student (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    course VARCHAR(30) NOT NULL,
    fee DOUBLE NOT NULL
);

CREATE TABLE Student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    date_of_birth DATE
);
INSERT INTO Student (id, name, age, date_of_birth)
VALUES (1, 'Kannan', 20, '10-06-2005');

INSERT INTO Student (id, name, age, date_of_birth)
VALUES (2, 'Veera', 22, '15-02-2003');
SELECT * FROM Student;
DROP TABLE Student;

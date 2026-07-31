-- ============================================
-- QUESTION 1: Student Marks
-- ============================================

-- Function to calculate total marks
CREATE OR REPLACE FUNCTION calculate_total(
    mark1 INT,
    mark2 INT, 
    mark3 INT
)
RETURNS INT
LANGUAGE plpgsql
AS $$
BEGIN
    RETURN mark1 + mark2 + mark3;
END;
$$;

-- Procedure to display result
CREATE OR REPLACE PROCEDURE student_result(
    mark1 INT,
    mark2 INT,
    mark3 INT
)
LANGUAGE plpgsql
AS $$
DECLARE
    total INT;
BEGIN
    total := calculate_total(mark1, mark2, mark3);

    RAISE NOTICE 'Total Marks : %', total;

    IF total >= 150 THEN
        RAISE NOTICE 'Result : PASS';
    ELSE
        RAISE NOTICE 'Result : FAIL';
    END IF;
END;
$$;

-- Execute
CALL student_result(60, 55, 50);


-- ============================================
-- QUESTION 2: Simple Interest
-- ============================================

-- Function to calculate Simple Interest
CREATE OR REPLACE FUNCTION calculate_si(
    principal NUMERIC,
    rate NUMERIC,
    time NUMERIC
)
RETURNS NUMERIC
LANGUAGE plpgsql
AS $$
BEGIN
    RETURN (principal * rate * time) / 100;
END;
$$;

-- Procedure to display Principal, SI and Total Amount
CREATE OR REPLACE PROCEDURE simple_interest(
    principal NUMERIC,
    rate NUMERIC,
    time NUMERIC
)
LANGUAGE plpgsql
AS $$
DECLARE
    si NUMERIC;
    total NUMERIC;
BEGIN
    si := calculate_si(principal, rate, time);
    total := principal + si;

    RAISE NOTICE 'Principal Amount : %', principal;
    RAISE NOTICE 'Simple Interest  : %', si;
    RAISE NOTICE 'Total Amount     : %', total;
END;
$$;

-- Execute
CALL simple_interest(10000, 5, 2);
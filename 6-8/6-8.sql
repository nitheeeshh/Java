-- ============================================
-- ONLINE SHOPPING SYSTEM
-- ============================================

-- Step 1: Create Table
CREATE TABLE products (
    product_id SERIAL PRIMARY KEY,
    product_name VARCHAR(100),
    price NUMERIC(10,2),
    stock INT
);

-- Step 2: Insert Sample Data
INSERT INTO products(product_name, price, stock)
VALUES
('Laptop', 50000, 10),
('Mouse', 500, 50),
('Keyboard', 1200, 30),
('Headphones', 2000, 20);

-- Display Products
SELECT * FROM products;

-- ============================================
-- PURCHASE PRODUCT (Reduce Stock)
-- ============================================

BEGIN;

UPDATE products
SET stock = stock - 1
WHERE product_id = 1
AND stock > 0;

SELECT * FROM products;

-- Save the transaction
COMMIT;

-- ============================================
-- ROLLBACK EXAMPLE
-- ============================================

BEGIN;

UPDATE products
SET stock = stock - 2
WHERE product_id = 2;

SELECT * FROM products;

-- Cancel the transaction
ROLLBACK;

SELECT * FROM products;

-- ============================================
-- CREATE VIEW
-- ============================================

CREATE VIEW product_view AS
SELECT
    product_id,
    product_name,
    price,
    stock
FROM products;

-- Display View
SELECT * FROM product_view;

-- ============================================
-- CREATE CUSTOMER USER
-- (Run only once)
-- ============================================

CREATE USER customer WITH PASSWORD 'customer123';

-- ============================================
-- GRANT READ PERMISSION
-- ============================================

GRANT CONNECT ON DATABASE postgres TO customer;

GRANT USAGE ON SCHEMA public TO customer;

GRANT SELECT ON product_view TO customer;

-- ============================================
-- CHECK PRODUCTS
-- ============================================

SELECT * FROM products;

SELECT * FROM product_view;
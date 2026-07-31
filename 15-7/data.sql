
TRUNCATE TABLE members, subscriptions, payments, attendance RESTART IDENTITY CASCADE;
CREATE TABLE IF NOT EXISTS members (
    member_id VARCHAR(50) PRIMARY KEY,
    full_name VARCHAR(100) NOT NULL,
    phone VARCHAR(20),
    email VARCHAR(100),
    gender VARCHAR(20),
    age INT NOT NULL,
    height VARCHAR(10),
    weight VARCHAR(10)
);

INSERT INTO members (member_id, full_name, phone, email, gender, age, height, weight) VALUES 
('AIM-1001', 'Vikram Kumar', '+91 9876543210', 'vikram@example.com', 'Male', 28, '175', '72'),
('AIM-1002', 'Sneha Desai', '+91 9876543211', 'sneha@example.com', 'Female', 24, '162', '55'),
('AIM-1003', 'Ramesh Kumar', '+91 9876543212', 'ramesh@example.com', 'Male', 32, '180', '80');

CREATE TABLE IF NOT EXISTS subscriptions (
    sub_id SERIAL PRIMARY KEY,
    member_id VARCHAR(50) REFERENCES members(member_id) ON DELETE CASCADE,
    duration_plan VARCHAR(50) NOT NULL,
	ALTER TABLE members ADD COLUMN status VARCHAR(20) DEFAULT 'Active';
    start_date DATE NOT NULL,
    expiry_date DATE NOT NULL,
    status VARCHAR(20) NOT NULL
);

INSERT INTO subscriptions (member_id, duration_plan, start_date, expiry_date, status) VALUES 
('AIM-1001', '1 Year (Annual)', '2026-01-15', '2027-01-15', 'Active'),
('AIM-1002', '3 Months', '2026-05-10', '2026-08-10', 'Active'),
('AIM-1003', '1 Month', '2026-06-25', '2026-07-25', 'Expiring Soon');

CREATE TABLE IF NOT EXISTS payments (
    payment_id SERIAL PRIMARY KEY,
    member_id VARCHAR(50) REFERENCES members(member_id),
    amount DECIMAL(10,2) NOT NULL,
    payment_mode VARCHAR(30) NOT NULL,
    payment_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO payments (member_id, amount, payment_mode, payment_date) VALUES 
('AIM-1001', 12000.00, 'Credit / Debit Card', '2026-01-15 10:30:00'),
('AIM-1002', 4500.00, 'UPI', '2026-05-10 11:15:00'),
('AIM-1003', 1800.00, 'Cash', '2026-06-25 09:00:00');

CREATE TABLE IF NOT EXISTS attendance (
    log_id SERIAL PRIMARY KEY,
    member_id VARCHAR(50) REFERENCES members(member_id) ON DELETE CASCADE,
    check_in_time TIMESTAMP NOT NULL,
    check_out_time TIMESTAMP,
    duration VARCHAR(20)
);

INSERT INTO attendance (member_id, check_in_time, check_out_time, duration) VALUES 
('AIM-1001', '2026-07-25 06:30:00', '2026-07-25 07:45:00', '1h 15m'),
('AIM-1002', '2026-07-25 07:00:00', '2026-07-25 08:30:00', '1h 30m'),
('AIM-1003', '2026-07-25 17:30:00', NULL, NULL); 

select * from members
select * from subscriptions
select * from payments
select * from attendance

SELECT * FROM members m
LEFT JOIN subscriptions s ON m.member_id = s.member_id
LEFT JOIN payments p ON m.member_id = p.member_id
LEFT JOIN attendance a ON m.member_id = a.member_id;
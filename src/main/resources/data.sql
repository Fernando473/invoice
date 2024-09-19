INSERT INTO users (firstname, password, role)
SELECT 'admin', 'secret', "Admin"
    WHERE NOT EXISTS (SELECT * FROM users WHERE firstname='admin');
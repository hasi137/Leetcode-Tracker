-- Last updated: 11/07/2026, 12:37:42
# Write your MySQL query statement below
SELECT name AS Customers
FROM Customers
WHERE id NOT IN
(
    SELECT customerId
    FROM Orders
);
-- Last updated: 11/07/2026, 12:33:47
# Write your MySQL query statement below
SELECT 
    eu.unique_id,
    e.name
FROM Employees e
LEFT JOIN EmployeeUNI eu
ON e.id = eu.id;
-- Last updated: 11/07/2026, 12:37:45
# Write your MySQL query statement below
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;
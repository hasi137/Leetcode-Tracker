-- Last updated: 11/07/2026, 12:35:39
# Write your MySQL query statement below
SELECT *
FROM Cinema
WHERE id % 2 = 1
AND description != 'boring'
ORDER BY rating DESC;
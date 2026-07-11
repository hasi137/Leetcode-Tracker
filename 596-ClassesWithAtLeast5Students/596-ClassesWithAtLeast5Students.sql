-- Last updated: 11/07/2026, 12:35:48
# Write your MySQL query statement below
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;
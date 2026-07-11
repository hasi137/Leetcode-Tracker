-- Last updated: 11/07/2026, 12:35:51
# Write your MySQL query statement below
SELECT name, population, area
FROM World
WHERE area >= 3000000 OR population >= 25000000;
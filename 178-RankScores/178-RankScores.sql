-- Last updated: 11/07/2026, 12:37:50
# Write your MySQL query statement below
SELECT 
    score,
    DENSE_RANK() OVER (ORDER BY score DESC) AS `rank`
FROM Scores;
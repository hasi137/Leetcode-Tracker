-- Last updated: 11/07/2026, 12:37:53
# Write your MySQL query statement below
SELECT(
    SELECT DISTINCT salary
    FROM Employee
    ORDER BY salary DESC
    LIMIT 1 OFFSET 1
)AS SecondHighestSalary;

-- Last updated: 11/07/2026, 12:37:37
# Write your MySQL query statement below
DELETE p1
FROM Person p1, Person p2
WHERE p1.email = p2.email
AND p1.id > p2.id;
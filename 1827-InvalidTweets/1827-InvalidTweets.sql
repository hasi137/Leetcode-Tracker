-- Last updated: 11/07/2026, 12:33:37
# Write your MySQL query statement below
SELECT tweet_id
FROM Tweets
WHERE LENGTH(content) > 15;
# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below
DELETE p1 FROM 
Person P1,Person P2 
WHERE P1.email=P2.email and p1.id>p2.id;
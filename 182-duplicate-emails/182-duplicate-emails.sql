# Write your MySQL query statement below
select Distinct(P1.email) As email from Person P1 join
Person P2 on P1.id<>P2.id and P1.email=P2.email;
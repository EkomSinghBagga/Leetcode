# Write your MySQL query statement below
SELECT c.name AS Customers from customers c where c.id Not in (Select o.CustomerId from orders o);

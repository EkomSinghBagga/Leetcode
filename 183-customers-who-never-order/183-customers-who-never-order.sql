# # Write your MySQL query statement below
# select c.name AS Customers from customers c left join
# orders o on c.id=o.customerId where o.customerid is null;
select name as Customers from customers c
where id not in (select customerid from orders);
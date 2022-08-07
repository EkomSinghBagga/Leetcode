# Write your MySQL query statement below
Select E1.name as employee from employee E1 join 
Employee E2 on E1.managerId=e2.id and E1.salary>E2.salary;

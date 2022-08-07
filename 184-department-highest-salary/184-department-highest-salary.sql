# Write your MySQL query statement below
select d.name as Department,e.name As Employee,e.salary As Salary from employee e join 
department d on e.departmentId=d.id 
where (departmentId,salary) in 
(select departmentId,max(salary) from employee group by departmentId);
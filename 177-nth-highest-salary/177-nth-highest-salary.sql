CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
     Set N=N-1;
  RETURN (
      # Write your MySQL query statement below.
      #      SELECT DISTINCT(salary) from Employee order by salary DESC
      # LIMIT 1 OFFSET N

     select distinct(salary) from Employee order by salary DESC limit 1 offset N
  );
END
select IFNULL((Select distinct salary from employee order by salary desc limit 1 offset 1),NULL) 
AS SecondHighestSalary; 
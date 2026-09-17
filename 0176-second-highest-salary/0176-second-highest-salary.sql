# Write your MySQL query statement below
SELECT MAX(Salary) AS SecondHighestSalary
FROM
(
    SELECT DISTINCT Salary
    FROM Employee
    ORDER BY Salary DESC
    LIMIT 1 OFFSET 1
) 
AS temp;


-- SELECT (
--     SELECT DISTINCT Salary
--     FROM Employee
--     ORDER BY Salary DESC
--     LIMIT 1 OFFSET 1
-- ) AS SecondHighestSalary;
    
 
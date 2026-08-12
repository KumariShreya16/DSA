# Write your MySQL query statement below
SELECT name,bonus 
FROM Employee
LEFT JOIN bonus using (empId)
WHERE IFNULL(bonus,0)<1000;

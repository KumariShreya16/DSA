# Write your MySQL query statement below Employees as e and EmployeeUNI as au
SELECT name, unique_id
FROM Employees
LEFT JOIN EmployeeUNI
ON Employees.id= EmployeeUNI.id;

#SELECT eu.unique_id, e.name
#FROM Employees e
#LEFT JOIN EmployeeUNI eu
#ON e.id = eu.id;
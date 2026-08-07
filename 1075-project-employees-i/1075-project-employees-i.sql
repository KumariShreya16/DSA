# Write your MySQL query statement below
select project_id, ROUND(AVG(experience_years),2) as average_years
from project
JOIN Employee
ON Project.employee_id= Employee.employee_id
GROUP by project_id;



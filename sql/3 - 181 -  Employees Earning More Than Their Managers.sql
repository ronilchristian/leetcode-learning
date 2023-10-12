-- 181 -  Employees Earning More Than Their Managers

SELECT a.name as 'Employee'
FROM Employee as a
JOIN Employee as b ON a.managerId = b.id
WHERE a.salary > b.salary;

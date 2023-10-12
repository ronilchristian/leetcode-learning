-- 184 -  Department Highest Salary

SELECT d.name AS 'Department', e.name AS 'Employee', e.salary AS 'Salary'
FROM Employee AS e
JOIN Department AS d ON e.departmentId = d.id
WHERE (d.id, e.salary) IN (
    SELECT departmentId, MAX(Salary)
    FROM Employee
    GROUP BY departmentId
);

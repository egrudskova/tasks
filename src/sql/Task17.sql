/*
Write a solution to find the employees who earn more than their managers.
https://leetcode.com/problems/employees-earning-more-than-their-managers/description/
*/

SELECT e.name Employee
FROM Employee e
    JOIN Employee m
        ON e.managerId = m.id
WHERE e.salary > m.salary
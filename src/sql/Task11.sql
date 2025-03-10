/*
Give me a count of the number of employees by city
*/

SELECT city, COUNT(*)
FROM employees
GROUP BY city
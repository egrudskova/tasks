/*
Write a solution to find all customers who never order anything.
https://leetcode.com/problems/customers-who-never-order/description/
*/

SELECT name Customers
FROM Customers
WHERE id NOT IN (
    SELECT customerId
    FROM Orders
)
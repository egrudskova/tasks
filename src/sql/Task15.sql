/*
List the names of the top five customers based on the sums of their invoice totals
*/

SELECT c.first_name, c.last_name, SUM(total)
FROM customers c
    JOIN invoices i
        ON c.id = i.customer_id
GROUP BY c.first_name, c.last_name
ORDER BY SUM(total) DESC
    LIMIT 5

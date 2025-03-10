/*
Give me a list of the top 5 cities by number of invoices in descending order
*/

SELECT billing_city, COUNT(*)
FROM invoices
GROUP BY billing_city
ORDER BY COUNT(*) DESC
    LIMIT 5
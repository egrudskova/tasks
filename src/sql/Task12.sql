/*
Give me a list of the top 3 countries by number of customers in descending order
*/

SELECT country, COUNT(*)
FROM customers
GROUP BY country
ORDER BY COUNT(*) DESC
    LIMIT 3
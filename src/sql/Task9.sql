/*
Задание 9
Какие компании организуют перелеты из Владивостока (Vladivostok)?
https://sql-academy.org/ru/trainer/tasks/9
*/

SELECT DISTINCT c.name
FROM Company c
         JOIN Trip t
              ON c.id = t.company
WHERE town_from = "Vladivostok"
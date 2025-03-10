/*
Задание 6
Какие компании совершали перелеты на Boeing
https://sql-academy.org/ru/trainer/tasks/6
*/

SELECT DISTINCT c.name
FROM Company c
         JOIN Trip t
              ON c.id = t.company
WHERE plane = "Boeing"
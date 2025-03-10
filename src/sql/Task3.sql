/*
Задание 3
Вывести все рейсы, совершенные из Москвы
https://sql-academy.org/ru/trainer/tasks/3
*/

SELECT *
FROM Trip
WHERE town_from = "Moscow"
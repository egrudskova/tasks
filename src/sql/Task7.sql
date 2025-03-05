/*
Задание 7
Вывести все названия самолётов, на которых можно улететь в Москву (Moscow)
https://sql-academy.org/ru/trainer/tasks/7
*/

SELECT DISTINCT plane
FROM Trip
WHERE town_to = "Moscow"
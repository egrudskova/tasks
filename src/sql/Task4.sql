/*
Задание 4
Вывести имена людей, которые заканчиваются на "man"
https://sql-academy.org/ru/trainer/tasks/4
*/

SELECT name
FROM passenger
WHERE name LIKE "%man"
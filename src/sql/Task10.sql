/*
Задание 10
Вывести вылеты, совершенные с 10 ч. по 14 ч. 1 января 1900 г.
https://sql-academy.org/ru/trainer/tasks/10
*/

SELECT *
FROM Trip
WHERE time_out BETWEEN '1900-01-01 10:00:00' AND '1900-01-01 14:00:00'
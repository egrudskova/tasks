/*
Задание 5
Вывести количество рейсов, совершенных на TU-134
https://sql-academy.org/ru/trainer/tasks/5
*/

SELECT COUNT(id) count
FROM Trip
WHERE plane = "TU-134"
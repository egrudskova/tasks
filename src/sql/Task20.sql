/*
Write a solution to find the first login date for each player.
https://leetcode.com/problems/game-play-analysis-i/description/
*/

SELECT player_id, MIN(event_date) first_login
FROM Activity
GROUP BY player_id;
/*
List all artist names alongside the titles of their albums
*/

SELECT a.name, al.title
FROM albums al
    JOIN artists a
        ON al.artist_id = a.id

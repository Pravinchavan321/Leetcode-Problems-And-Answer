-- # Write your MySQL query statement below
-- SELECT name AS results 
-- FROM (
--     SELECT mr.user_id, u.name, COUNT(*) as count
--     FROM MovieRating mr
--     LEFT JOIN Users u
--     ON mr.user_id = u.user_id
--     GROUP BY mr.user_id, name
--     ORDER BY count DESC, name ASC
--     LIMIT 1
-- ) AS highrateuser
-- UNION ALL
-- SELECT harm.title as results
-- FROM (
--     SELECT m.title, AVG(mr.rating) as avg_rating
--     FROM MovieRating mr
--     LEFT JOIN Movies m
--     ON mr.movie_id = m.movie_id
--     WHERE YEAR(mr.created_at) = YEAR('2020-02-01') AND MONTH(mr.created_at) = MONTH('2020-02-01')
--     GROUP BY m.title
--     ORDER BY avg_rating DESC,  m.title
--     LIMIT 1
-- ) AS harm


SELECT name AS results
FROM (
    SELECT u.name, COUNT(*) AS rating_count
    FROM MovieRating mr
    JOIN Users u
        ON mr.user_id = u.user_id
    GROUP BY mr.user_id, u.name
    ORDER BY rating_count DESC, u.name ASC
    LIMIT 1
) AS user_result

UNION ALL

SELECT title AS results
FROM (
    SELECT m.title, AVG(mr.rating) AS avg_rating
    FROM MovieRating mr
    JOIN Movies m
        ON mr.movie_id = m.movie_id
    WHERE mr.created_at >= '2020-02-01'
      AND mr.created_at < '2020-03-01'
    GROUP BY m.movie_id, m.title
    ORDER BY avg_rating DESC, m.title ASC
    LIMIT 1
) AS movie_result;
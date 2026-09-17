# Write your MySQL query statement below
-- SELECT x, y, z, (
--     CASE
--         WHEN x + y > z AND y + z > x AND x + z > y THEN "Yes"
--         ELSE "No"
--     END
-- ) AS triangle
-- FROM Triangle


SELECT x, y, z, IF(x + y > z AND y + z > x AND x + z > y, "Yes", "No") AS triangle
FROM Triangle

-- 620 -  Not Boring Movies

SELECT * FROM Cinema
WHERE id % 2 != 0 AND NOT (description LIKE 'boring')
ORDER BY rating DESC;

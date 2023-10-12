-- 182 -  Duplicate Emails

-- # SELECT DISTINCT p1.email
-- # FROM Person as p1
-- # JOIN Person as p2 ON p1.email = p2.email
-- # WHERE p1.id != p2.id;

SELECT email 
FROM (SELECT COUNT(email) AS c, email 
      FROM Person
      GROUP BY email) AS freq
WHERE freq.c > 1;

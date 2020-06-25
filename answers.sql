--Movie Lens

--1
SELECT title, release_date
FROM movies
WHERE release_date BETWEEN '1983-01-01' AND '1993-12-31'
ORDER BY release_date DESC;

SELECT title, release_date
FROM movies
WHERE release_date >= '1983%' AND release_date <= '1994%'
ORDER BY release_date DESC;

--2
SELECT * FROM
(SELECT DISTINCT movies.id, movies.title, AVG(ratings.rating) AS avg_rating
FROM movies
JOIN ratings ON movies.id = ratings.movie_id
GROUP BY movies.id
ORDER BY avg_rating) as min_avg_ratings_table
WHERE avg_rating =  1;

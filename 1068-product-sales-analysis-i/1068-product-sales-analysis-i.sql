# Write your MySQL query statement below
SELECT product_name, s.year, s.price
FROM sales s
LEFT JOIN product t
ON t.product_id = s.product_id;
# Write your MySQL query statement below
SELECT customer_id
from Customer
group by customer_id
HAVING COUNT(DISTINCT product_key)=(select count(*) from product);

use sba_mockup;

-- Question 1 correct
-- Create a query to return all orders made by 
-- users with the first name of "Marion"
select o.order_id, u.user_id, o.store_id
from users u
inner join orders o using (user_id)
where first_name='Marion'
order by FIRST_NAME;

-- Question2 correct
-- Create a query to select all users that 
-- have not made an order
select user_id, FIRST_NAME, LAST_NAME, CITY
from users
left join orders using (user_id)
where ORDER_ID is null;

-- question3 correct
-- Create a Query to select the names and prices 
select i.name, i.price
from items i
inner join order_items oi using (item_id)
inner join orders o using (order_id)
group by ITEM_ID having count(item_ID) >1;

-- question4 correct
-- Create a query to return the Order Id, Item name, 
-- Item Price, and Quantity from orders made at 
-- stores in the city "New York". Order by Order Id 
-- in ascending order.
select order_id, name, price, quantity
from order_items
inner join items using (item_id)
inner join orders using (order_id)
inner join users using (user_id)
where city='New York'
order by order_id asc;

-- question5
-- Your boss would like you to create a query 
-- that calculates the total revenue generated 
-- by each item. Revenue for an item can be 
-- found as (Item Price * Total Quantity Ordered). 
-- Please return the first column as 'ITEM_NAME' 
-- and the second column as 'REVENUE'.
select i.name as ITEM_NAME, 
       sum(i.price * oi.quantity) as REVENUE
from items i
inner join order_items oi using (item_id)
group by i.name
order by REVENUE desc;


-- question6
-- Create a query with the following output:
--   a. Column 1 - Store Name
--     i. The name of each store 
--   b. Column 2 - Order Quantity
--     i. The number of times an order has been made in this store 
--   c. Column 3 - Sales Figure
--     i. If the store has been involved in more than 3 orders, 
--        mark as 'High'
--     ii. If the store has been involved in less than 3 
--         orders but more than 1 order, mark as 'Medium'
--    iii. If the store has been involved with 1 or less orders, 
--         mark as 'Low'
--    d. Should be ordered by the Order Quantity in descending order
select s.name, 
       count(o.order_id) as ORDER_QUANTITY,
       case
          when count(o.order_id) > 3 then 'HIGH'
          when count(o.order_id) > 1 then 'MEDIUM'
          when count(o.order_id) >= 0 then 'LOW'
	   end as SALES_FIGURE
from stores s
inner join orders o using (store_id)
group by s.name
order by ORDER_QUANTITY desc;






 
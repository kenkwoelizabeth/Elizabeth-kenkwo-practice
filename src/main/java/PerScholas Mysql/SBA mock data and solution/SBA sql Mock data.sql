use sba_mockup;

-- Question 1 correct
select order_id, user_id, store_id
from users
inner join orders using (user_id)
where first_name='Marion'
order by FIRST_NAME;

-- Question2 correct
select user_id, FIRST_NAME, LAST_NAME, CITY
from users
left join orders using (user_id)
where ORDER_ID is null;

-- question3 correct
select name, price
from items
inner join order_items using (item_id)
inner join orders using (order_id)
group by ITEM_ID having count(item_ID) >1;

-- question4 correct
select order_id, name, price, quantity
from order_items
inner join items using (item_id)
inner join orders using (order_id)
inner join users using (user_id)
where city='New York'
order by order_id asc;

-- question5
select name as ITEM_NAME,sum(price * quantity) as REVENUE
from ITEMS
inner join ORDER_ITEMS using (item_id);

-- question6
select name , quantity as ORDER_QUANTITY, 
SALES_FIGURE,





 
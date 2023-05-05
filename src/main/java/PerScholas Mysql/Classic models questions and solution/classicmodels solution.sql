use classicmodels;

-- Question1
-- Write a query to display each customer’s name 
-- (as “Customer Name”) along with the name of the 
-- employee who is responsible for that customer’s orders. 
-- The employee name should be in a single “Sales Rep” column,
--  formatted as “lastName, firstName.” The output should be
--  sorted alphabetically by customer name.

select c.customerName as 'Customer Name', concat(e.lastName, ', ', e.firstName) as 'Sales Rep'
from customers c JOIN employees e 
on c.salesRepEmployeeNumber = e.employeeNumber
order by c.customerName asc;

-- question2
-- To determine which products are the most popular with 
-- our customers. For each product, list the total quantity
--  ordered, along with the total sale generated 
-- (total quantity ordered * priceEach) for that product. 
-- The column headers should be “Product Name,” 
-- “Total # Ordered,” and “Total Sale.” List the products
--  by Total Sales descending.

select p.productName as 'Product Name', sum(od.quantityOrdered) as 'Total # Ordered', sum(od.quantityOrdered * od.priceEach) as 'Total Sale'
from products p LEFT JOIN orderdetails od 
on p.productCode=od.productCode
group by p.productName, p.buyPrice
order by 3 desc;

-- question3
-- Write a query that lists order status and the number of 
-- orders with that status. Column headers should be “Order 
-- Status” and “Total Orders.” Sort alphabetically by status.

select status as 'Order Status', count(status) as 'Total Orders'
from orders
group by status
order by status;

-- question4
-- Write a query to list, for each product line, the total 
-- number of products sold from that product line. The first 
-- column should be “Product Line” and the second should be 
-- “total Sold.” Order by the second column, descending.

select 
     pl.productLine as 'Product Line', 
     count(od.productCode) as 'total Sold'
from productLines pl join products p 
on pl.productLine=p.productLine
 JOIN orderdetails od on p.productCode=od.productCode
group by pl.productLine
order by 2 desc;

-- question 5
-- Your product team is requesting data to help them create 
-- a bar chart of monthly sales made since the company’s 
-- inception. Write a query to output the month 
-- (January, February, etc.), 4-digit year, and total sales 
-- for each month. The first column should be labeled ‘Month,’ 
-- the second column should be labeled ‘Year,’ and the third 
-- column should be labeled ‘Payments Received.’ Values in the 
-- third column should be formatted as numbers with two decimals (e.g., 694,292.68).

select 
   monthname(paymentDate) AS Month, 
   year(paymentDate) AS Year,
   format(sum(amount), 2) AS 'Payments Received'
from payments
group by monthname(paymentDate), year(paymentDate);

-- question 6

-- Write a query to display the Name, Product Line, Scale, and Vendor of all of the Car
--  products — both classic and vintage. The output should display all vintage cars first
--  (sorted alphabetically by name), and all classic cars last (also sorted alphabetically by name). 

SELECT p.productName Name, p.productLine AS `Product Line`, p.productScale AS `Scale`, p.productVendor AS `Vendor` FROM productlines l NATURAL JOIN products p 
WHERE l.productLine = "Classic Cars" OR l.productLine = "Vintage Cars"
ORDER BY p.productLine DESC, p.productName ASC;









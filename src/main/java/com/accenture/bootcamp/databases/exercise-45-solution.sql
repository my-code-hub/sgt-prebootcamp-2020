-- 1. write SQL statement which would return information for all customer orders:
--  (first_name, last name, order_id, order_time, ice_cream_name, quantity, price)
 select customers.first_name, customers.last_name, orders.id as order_id,
            orders.order_time, products.name as ice_cream, order_products.quantity,
            products.price
        from order_products
        inner join products on products.id = order_products.product_id
        inner join orders on orders.id = order_products.order_id
        inner join customers on customers.id = orders.customer_id;

-- 2. select the most ordered ice-creams and sort them by count in descending order
--    (ice_cream, count)

-- 3. select customers with most orders (descending order)
--    first_name, order_count

-- 4. select customers who have ordered most products in descending order (and only customers with more than 1
-- product)
-- first_name, product_count



--*** Exercise 44 - joins ***
    1)
        select customers.first_name, customers.last_name, orders.id as order_id,
            orders.order_time, products.name as ice_cream, order_products.quantity,
            products.price
        from order_products
        inner join products on products.id = order_products.product_id
        inner join orders on orders.id = order_products.order_id
        inner join customers on customers.id = orders.customer_id;

    2)
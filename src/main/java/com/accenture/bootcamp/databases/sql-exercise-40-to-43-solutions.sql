--*** Exercise 40 - creating schema & tables ***
--    Write the following SQL queries:
-- 1. Create database and name it: "pet_clinic".
create database pet_clinic;

-- 2. Create table "pets" with the following columns (choose appropriate data type):
--     id, name, type
create table pets (
    id int,
    name varchar(255),
    type varchar(255)
);

-- 3. Modify table and add column "date_of_birth", "age" and "color"
alter table pets
    add column date_of_birth date,
    add column age int,
    add column color varchar(255);

-- 4. Now modify table and remove the "color" column
alter table pets drop column color;

-- 5. Create table "vets" with single column (id)
create table vets(
    id int
);

-- 6. Delete table "vets"
drop table vets;



--*** Exercise 41 - manipulating data ***
--    Write SQL queries necessary to complete the points below:
-- 1. insert three pets in the "pets" table with the following values:
--     id - 1, name - Reksis, type - Husky, age - 5
--     id - 2, name - Buddy, type - Afador, age - 3
--     id - 3, name - Bailey, type - Akita, age 7
--     id - 4, name - Lucy, type - Auggie, age 11
--     id - 5, name - Oscar, type - Afador, age 8
insert into pets (id, name, type, age) values
    (1, 'Reksis', 'Husky', 5),
    (2, 'Buddy', 'Afador', 3),
    (3, 'Bailey', 'Akita', 7),
    (4, 'Lucy', 'Auggie', 11),
    (5, 'Oscar', 'Afador', 8);

-- 2. Write query which updates age for a dog with name "Reksis" to 7
update pets set age = 7 where name = 'Reksis';

-- 3. Write query which updates age to 7 for a any dog with name "Buddy" and type "Afador"
update pets set age = 7 where name = 'Buddy' and type = 'Afador';

-- 4. Write query which deletes all dogs with age greater than 10
delete from pets where age > 10;

-- 5. Set date_of_birth for all dogs to be 1st January, year 2015
update pets set date_of_birth = '2015-01-01';

-- 6. Alter column date_of_birth in table pets so it would not allow null
--   values and the default value of this column (if not specified when inserting entry) would be
--   current date. (see https://dev.mysql.com/doc/refman/8.0/en/data-type-defaults.html )
-- supported only in latest MySQL versions.
-- https://stackoverflow.com/questions/20461030/current-date-curdate-not-working-as-default-date-value

-- 7.  Select the oldest pet in table
select max(age) from pets;

-- 8.  Select youngest pet in table
select min(age) from pets;

-- 9.  Select average age of pets in pets table
select avg(age) from pets;

-- 10. Count how many pets are there in table
select count(*) from pets;



--*** Exercise 42 - Primary and foreign key exercise ***
-- 1. Modify id column of the pets table so it would be PRIMARY KEY, NOT NULL and AUTO INCREMENT
ALTER TABLE pets
ADD PRIMARY KEY (id);

alter table pets
modify column id int auto_increment;

-- 2. Try to insert a new pet without specifying id. What happened? Did
insert into pets (name, type, age, date_of_birth) values
    ('Lesija', 'Husky', 1, CURRENT_DATE);
--     database automatically generate a id for you?
    -- Answer: yes, it did!

-- 3. Now try to insert two different pet entries into database with the same id.
--     What happened when you tried doing that? What did MySQL console say?
insert into pets (id, name, type, age, date_of_birth) values
    (7, 'Snickers', 'Pitbul', 2, CURRENT_DATE),
    (7, 'Mars', 'Pitbul', 2, CURRENT_DATE);
    -- Error executing INSERT statement. Duplicate entry '7' for key 'PRIMARY' - Connection: SGT-BOOTCAMP-2020: 34ms
    -- because id column is primary key and we can't have multiple entries with the same id

-- 4. Create new table "owners" with the following columns:
--     id - integer, PRIMARY KEY, NOT NULL and AUTO INCREMENT
--     first_name, last_name, address, city, telephone
    CREATE TABLE owners (
        id int(11) NOT NULL AUTO_INCREMENT,
        first_name varchar(255),
        last_name varchar(255),
        address varchar(255),
        city varchar(255),
        telephone varchar(12),
        PRIMARY KEY (id)
    );

-- 5. Add three entries into owners table.
--     John, Jane and Max (last name, address, city and phone is up to you)
    INSERT INTO owners (first_name, last_name, address, city, telephone) VALUES
    ('John', 'Owl', 'Rojas street 20', 'Riga', '+37122222222'),
    ('Jane', 'Seagull', 'Ventas street 30', 'Riga', '+37133333333'),
    ('Max', 'Pigeon', 'Ostas street 40', 'Riga', '+37144444444');

-- 6. Now you have to create relation between owners and pets table.
--     a. Add owner_id column to pets table (data type should match the id column of owners table)
    ALTER TABLE pets
    ADD owner_id int(11);

    -- b. Update pets table so pets would have owners:
    --     Reksis -> John
    --     Buddy  -> Max
    --     Bailey -> Max
    --     Oscar  -> Jane
        UPDATE pets SET owner_id = 1 WHERE name = 'Reksis';
        UPDATE pets SET owner_id = 3 WHERE name = 'Buddy';
        UPDATE pets SET owner_id = 3 WHERE name = 'Bailey';
        UPDATE pets SET owner_id = 2 WHERE name = 'Oscar';

    -- c. Now delete Jane from owners table.
    --     Did this work?
    --     Should this work and is the data in pets table correct/valid now?
    --     What is the value of owner_id column n for Oscar? Do you see a problem here?
        DELETE FROM owners WHERE first_name = 'Jane';
    --Answer: yes it worked, it shouldn't work since the owner_id for Jane was shown into pets table. Pets table is not valid now.
    -- owner_id for Oscar is 2 and that is a problem since there are no more information about owner with id 2.

-- 7. Add foreign key constraint to owner_id column of pets table.
--      To which foreign key should this column point?
--      You will most likely fail initially when you try to do it. Read the error
--      and try to understand why. You might have to change data in one of the tables.
    ALTER TABLE pets
    ADD CONSTRAINT FK_ownerKey
    FOREIGN KEY (owner_id) REFERENCES owners(id);
    DELETE FROM pets
    WHERE owner_id = 2;
    ALTER TABLE pets
    ADD CONSTRAINT FK_ownerKey
    FOREIGN KEY (owner_id) REFERENCES owners(id);
--Answer: owner_id column should point to owners table id column. The error occurred since the Jane from owner id table was
-- deleted and her id still was shown in pets table.

-- 8. After you successfully created foreign key, inset Jane back into owners table.
INSERT INTO owners (id, first_name, last_name, address, city, telephone) VALUES
(2, 'Jane', 'Seagull', 'Ventas street 30', 'Riga', '+37133333333');

-- 9. Now try to delete owner with name 'Max'
--     Did it work? Why?
--     Should it work?
DELETE FROM owners WHERE first_name = 'Max';
--Answer: it didn't work since the owners tables id column is attached to pets table owners_id column and Max as an
--owner is linked to pets table. No it shouldn't work since we have foreign key constraint.

-- 10. Add new pet with owner_id 1001. Did it work? Why?
INSERT INTO pets (id, name, type, age, owner_id) VALUES
(6, 'Lulu', 'Great Dane', 5, 1001);
--Answer: it did not work because there is no such id as 1001 in owners table entered. FK constraint
--          ensures that we can't enter invalid data.



-- *** Exercise 43 - relationships and modeling database ***/
create TABLE customers (
    id int(11) NOT NULL AUTO_INCREMENT,
    first_name varchar(255) NOT NULL,
    last_name varchar(255) NOT NULL,
    email varchar(255) NOT NULL,
    address varchar(255) NOT NULL,
    city varchar(255) NOT NULL,
    PRIMARY KEY (id)
);

create TABLE products (
    id int(11) NOT NULL AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    price decimal(3,2) NOT NULL,
    description varchar(255) NOT NULL,
    PRIMARY KEY (id)
);

create TABLE orders (
    id int(11) NOT NULL AUTO_INCREMENT,
    order_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
    customer_id int(11) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (customer_id) REFERENCES customers(id)
);

create TABLE order_products (
    id int(11) NOT NULL AUTO_INCREMENT,
    product_id int(11) NOT NULL,
    quantity int (11) NOT NULL,
    order_id int(11) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (product_id) REFERENCES products(id),
    FOREIGN KEY (order_id) REFERENCES orders(id)
);


-- b. Insert some demo data in each of those tables

-- add customers
insert into customers values
(null, 'Lauma', 'Priede', 'lauma@boo.com', 'Akas street 12', 'Riga'),
(null, 'Agnese', 'Liepina', 'agnese@boo.com', 'Elizabetes street 26', 'Riga'),
(null, 'Andris', 'Klava', 'andris@boo.com', 'Basu street 21', 'Riga'),
(null, 'Oskars', 'Osis', 'oskars@boo.com', 'Dammes street 54', 'Riga');

-- add products
insert into products values
(null, 'Almond', 0.95, 'sweet, nutty'),
(null, 'Pistachio', 1.25, 'sweet, creamy, nutty'),
(null, 'Lavender', 1.15, 'sweet, herbal'),
(null, 'Basil', 1.35, 'sweet, herbal'),
(null, 'Mango', 1.05, 'fresh, fruity'),
(null, 'Salty caramel', 1.40, 'saltysweet, creamy');

-- add orders to customers
insert into orders (customer_id) values
(1),
(1),
(2),
(3),
(4);

-- Add order details (how many products and product types for which order)
insert into order_products (product_id, quantity, order_id) values
(4, 2, 1),
(3, 1, 2),
(6, 2, 2),
(1, 3, 3),
(2, 3, 3),
(5, 1, 4),
(6, 2, 5);



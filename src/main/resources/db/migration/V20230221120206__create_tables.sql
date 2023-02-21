create table cars
(
  id             serial not null,
  body_type      smallint,
  equipment_type smallint,
  model          varchar(255),
  price          numeric(38, 2
)
, release_year integer, manufacturer_id integer, primary key
(
id
)
);
create table cars_orders
(
  car_id   integer not null,
  order_id integer not null
);
create table manufacturers
(
  id      serial not null,
  country varchar(255),
  name    varchar(255), primary key(id)
);
create table orders
(
  id       serial not null,
  comments varchar(255), delivery_date timestamp(6
)
, order_date timestamp
(
6
)
,
status smallint, customer_id integer, seller_id integer, primary key(id));
create table users_t
(
  id         serial not null,
  email      varchar(255),
  first_name varchar(255),
  last_name  varchar(255),
  password   varchar(255),
  role       smallint, primary key(id)
);
alter table if exists cars add constraint FK6hctqxdwhcl223hfxh4swhdxm foreign key(manufacturer_id)
references manufacturers;
alter table if exists cars_orders add constraint FKk79lqei6bmq5v2isn4pl0apgu foreign key(order_id)
references orders;
alter table if exists cars_orders add constraint FK1jyni79qmj84o9cusahbvnyta foreign key(car_id)
references cars;
alter table if exists orders add constraint FKhg5kp3qpqoinq67c32cqf7lma foreign key(customer_id)
references users_t;
alter table if exists orders add constraint FKeubwwky0nkd8buc2q078oklod foreign key(seller_id)
references users_t;

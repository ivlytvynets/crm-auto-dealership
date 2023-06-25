create table cars (id bigserial not null, body_type smallint, equipment_type smallint, model varchar(255), price numeric(38,2), release_year integer, manufacturer_id bigint, primary key (id));
create table cars_orders (car_id bigint not null, order_id bigint not null);
create table countries (id bigserial not null, name varchar(255), primary key (id));
create table manufacturers (id bigserial not null, name varchar(255), country_id bigint, primary key (id));
create table orders (id bigserial not null, comments varchar(255), customer_email varchar(255), delivery_date timestamp(6), order_date timestamp(6), seller_email varchar(255), status smallint, primary key (id));
alter table if exists cars add constraint FK6hctqxdwhcl223hfxh4swhdxm foreign key (manufacturer_id) references manufacturers;
alter table if exists cars_orders add constraint FKk79lqei6bmq5v2isn4pl0apgu foreign key (order_id) references orders;
alter table if exists cars_orders add constraint FK1jyni79qmj84o9cusahbvnyta foreign key (car_id) references cars;
alter table if exists manufacturers add constraint FKe13erdojygfdwr7mvn3m6dtql foreign key (country_id) references countries;

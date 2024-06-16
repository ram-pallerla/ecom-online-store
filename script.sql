create table Product
(
    product_id  serial
        constraint Product_pk
            primary key,
    title       varchar(50) not null,
    description varchar(500),
    image       text,
    price       double precision
);

create table "user"
(
    user_id    serial
        constraint user_pk
            primary key,
    first_name varchar(50)  not null,
    last_name  varchar(50)  not null,
    email      varchar(30)  not null,
    password   varchar(300) not null,
    role       varchar(30),
    phone      varchar(15),
    address    varchar(100),
    constraint user_email_uk
        unique (email)
);

create table purchase_item
(
    purchase_item_id serial
        constraint purchase_item_pk
            primary key,
    product_id       integer
        constraint purchase_item_product_id_fk
            references product,
    count            integer default 1
);

create table "order"
(
    order_id         serial
        constraint order_pk
            primary key,
    user_id          integer not null
        constraint order_user__user_id_fk
            references "user",
    purchase_item_id integer not null
        constraint order_purchase_item_purchase_item_id_fk
            references purchase_item,
    comment          text
);





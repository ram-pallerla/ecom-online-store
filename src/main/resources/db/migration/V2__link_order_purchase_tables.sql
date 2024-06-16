alter table estore.purchase_item
    add order_id integer not null;

alter table estore.purchase_item
    add constraint purchase_item_order_order_id_fk
        foreign key (order_id) references estore."order";

alter table estore."order"
    drop constraint order_purchase_item_purchase_item_id_fk;

alter table estore."order"
    drop column purchase_item_id;

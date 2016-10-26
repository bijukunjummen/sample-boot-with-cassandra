CREATE TABLE IF NOT EXISTS  sample.hotels (
    id UUID,
    name varchar,
    address varchar,
    zip varchar,
    primary key((id))
);

CREATE TABLE IF NOT EXISTS  sample.hotel_by_letter (
    first_letter varchar,
    hotel_name varchar,
    hotel_id UUID,
    address varchar,
    zip varchar,
    primary key((first_letter), hotel_name, hotel_id)
);
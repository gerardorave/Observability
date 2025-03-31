DROP TABLE IF EXISTS USER_DETAILS CASCADE;
CREATE TABLE USER_DETAILS (
user_id varchar(100) primary key,
first_name varchar(100),
last_name  varchar(100)
);
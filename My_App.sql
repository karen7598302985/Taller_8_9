
CREATE DATABASE My_App;
USE My_App;
CREATE TABLE user_tbl (
    user_id INT ,
    user_firstname VARCHAR(40) NOT NULL,
    user_lastname VARCHAR(40) NOT NULL,
    user_email VARCHAR(60) NOT NULL,
    user_password  VARBINARY(255) NOT NULL,
    primary key(user_id)
);

CREATE TABLE category(
    category_id INT ,
    category_name VARCHAR(50) NOT NULL,
    primary key(category_id)
);

CREATE TABLE product(
    product_id INT ,
    product_name VARCHAR(50) NOT NULL,
    product_value VARCHAR(50) NOT NULL,
    category_id INT,
    primary key(product_id),
    foreign key(category_id) references category(category_id)
);

insert into My_App (user_firstname, user_lastname, user_email, user_password) values (upper ('ana'), upper ('perez'), 'ana@gmail.com', aes_encrypt('mascota', '$2a$12$AxY05V.J8VognZln2uvqNegJ3N6lTu3iZhaoecb7JTQczsUEL6uBe'));
select user_firstname, user_lastname, user_email, user_password, cast(aes_decrypt(user_password, 'mascota', '$2a$12$AxY05V.J8VognZln2uvqNegJ3N6lTu3iZhaoecb7JTQczsUEL6uBe') as char (50)) end_data from users where user_id=1;  

select*from user_tbl;
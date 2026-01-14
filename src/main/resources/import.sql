-- Los nombres de las tablas deben coincidir con tus @Entity
INSERT INTO categories (name) VALUES ('Electrónica');
INSERT INTO categories (name) VALUES ('Ropa');

INSERT INTO products (name, price, category_id) VALUES ('Laptop Gamer', 1500.0, 1);
INSERT INTO products (name, price, category_id) VALUES ('Mouse Óptico', 25.0, 1);
INSERT INTO products (name, price, category_id) VALUES ('Camiseta Algodón', 15.0, 2);
DROP TABLE IF EXISTS inventory;
--drop sequence if exists xx_seq
--create sequence xx_seq start with 4 increment by 1

CREATE TABLE inventory (
  item_no INT PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  amount INT NOT NULL,
  inventory_code VARCHAR(250) NOT NULL
);

INSERT INTO inventory (item_no, name, amount, inventory_code) VALUES
  (1, 'item-1', 5, '1111'),
  (2, 'item-2', 5, '2222'),
  (3, 'item-3', 5, '3333')



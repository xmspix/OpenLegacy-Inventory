# OpenLegacy Inventory Assignment

The following is a job qualification exercise which requires knowledge in the following technologies:

- [x] Java
- [x] Spring boot
- [x] Swagger
- [x] REST API/JSON
- [x] Docker
- [x] Angular

Need to write a spring-boot application with a REST controller, which expose a Swagger API catalog.
The application needs to expose the following APIs:

# List of the inventory items list (item no, name, amount, inventory code)

- [x] Read item details (by item no)
- [x] Withdrawal quantity of a specific item from stock
- [x] Deposit quantity of a specific item to stock
- [x] Add item to stock
- [x] Delete an item from stock
- [x] Data should be persisted on H2 DB using JPA.
- [x] Need to pack and run the application from docker.
- [x] Need to send a link to GitHub for source and docker hub for docker image

# Usage

## Docker

```
docker pull xmspix/openlegacy-inventory:server
docker pull xmspix/openlegacy-inventory:client
```

## Server

H2 Database

```
url: http://localhost:8080/h2/
need to change JDBC URL to "jdbc:h2:mem:testdb"
username: h2
password: (empty)
```

Swagger API

```
http://localhost:8080/swagger-ui.html
```

## Client - Angular

```
http://localhost:4200/
```
